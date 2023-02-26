package tcpChatProgram;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;

public class ChatServer {
	/* ==== iv필드 ==== */

	// 서버소켓 생성
	ServerSocket serverSocket;		
	// 쓰레드pool 생성 : 쓰레드 100개 한도 내에서 사용한다.
	ExecutorService threadPool= Executors.newFixedThreadPool(100); 	
	// 채팅방 생성, HashMap은 동기화가 되어있지 않기 때문에 동기화작업 후 생성한다.
	Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<>());
	//	Map<String, SocketClient> chatRoom = new Hashtable<>();	// HashTable은 동기화가 되어있어 멀티쓰레드환경에서 적합



	/* ==== method 필드 ==== */

	// 서버생성
	public void start() throws IOException {
		// 서버포트 50500번으로 지정
		serverSocket = new ServerSocket(50500);
		System.out.println("[알림] 서버가 가동 되었습니다.");

		// 쓰레드 생성 (Runnable 인터페이스의 void run() 메서드를 구현하여 쓰레드의 매개변수로 집어넣음 )
		Thread th = new Thread( () -> {
			try {
				while(true) {
					// 클라이언트의 연결요청이 서버로 들어오면 수락한다.
					// 블로킹이 일어난다. 요청이 이루어지면 소켓이 생성되고 블로킹이 해제된다.
					Socket socket = serverSocket.accept();
					// [서버] 소켓클라이언트 객체는 서버객체와 요청이 받아진 후 생성된 소켓을 매개변수로 받는다.
					SocketClient sc = new SocketClient(ChatServer.this, socket);
				}
			} catch (Exception e) {
				
			}
		});

		th.start();
	}

	// 서버닫기
	public void stop() {
		try {
			serverSocket.close();
			threadPool.shutdownNow();
			chatRoom.values().stream().forEach((sc) -> sc.close());
		} catch (IOException e) {
		}
		System.out.println("[알림] 서버가 종료 되었습니다.");
	}

	// 이용자 접속 메서드
	public void addSocketClient(SocketClient socketClient) {
		// 이용자 이름 (괄호 안에 아이피를 부여하여 고유번호를 지정)
		String key = socketClient.chatName + "(" + socketClient.clientIp + ")";
		// 채팅방에 키값으로 이용자 이름과 socketClient를 집어넣는다.
		chatRoom.put(key, socketClient);
		System.out.println("[알림]" + key+"님이 입장 하셨습니다.");
		System.out.println("[알림] 현재 채팅자 수 : " + chatRoom.size() + "명\n");
	}

	// 이용자 퇴장 메서드
	public void removeSocketClient(SocketClient socketClient) {
		// 이용자 이름 (괄호 안에 아이피를 부여하여 고유번호를 지정)
		String key = socketClient.chatName + "(" + socketClient.clientIp + ")";
		// 채팅방에서 이용자를 지운다.
		chatRoom.remove(key);
		System.out.println("[알림]" + key+"님이 퇴장 하셨습니다.");
		System.out.println("[알림] 현재 채팅자 수 : " + chatRoom.size() + "명\n");
	}

	// 모든 이용자에게 메세지를 보냄
	public void sendToAll(SocketClient sender, String message) {
		// JSON객체 생성
		JSONObject root = new JSONObject();
		root.put("clientIp", sender.clientIp);
		root.put("chatName", sender.chatName);
		root.put("message", message);
		String json = root.toString();		

		Collection<SocketClient> socketClients = chatRoom.values();		// Map인터페이스의 .values()메서드는 반환타입이 Collection 인터페이스이다.
		for(SocketClient sc : socketClients) {
			if(sc == sender) continue;		// 메세지를 보낸 이용자는 메세지를 받을 수 없다. (즉, 본인이 보낸건 본인이 못받는다.)
			sc.send(json);			 // JSON형태로 메세지를 전달한다.
		}
		//		chatRoom.values().stream().filter((sc)-> sc!=sender).forEach((sc)-> sc.send(json));			// 위 코드와 동일
	}

	// main
	public static void main(String[] args) {
		try {
			ChatServer chatServer = new ChatServer();
			chatServer.start();

			System.out.println("===========================================");
			System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter키를 누르세요.");
			System.out.println("===========================================");

			// 키보드 입력
			Scanner sc = new Scanner(System.in);
			while(true) {
				String key = sc.nextLine();
				if(key.toLowerCase().equals("q")) break; 
				System.out.println(key);
			}
			sc.close();
		
			// q 또는 Q를 입력받고 무한반복 탈출하여 서버종료
			chatServer.stop();
		} catch (IOException e) {
			System.out.println("[서버] " + e.getMessage());
		}
	}

}
