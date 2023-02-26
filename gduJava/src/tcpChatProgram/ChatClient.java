package tcpChatProgram;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import org.json.JSONObject;


public class ChatClient {
	/* ==== iv필드 ==== */

	Socket socket;
	String chatName;
	// 보조스트림 (기본형 입출력)
	DataInputStream dis;
	DataOutputStream dos;

	/* ==== method 필드 ==== */

	// 이용자가 서버에 연결을 시도하는 메서드
	public void connect() throws IOException{
		socket = new Socket("localhost",50500);
		dis = new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(socket.getOutputStream());
		System.out.println("[알림] 클라이언트가 서버에 연결 되었습니다.");
	}

	// 이용자가 서버에서 연결을 끊는 메서드
	public void unconnect() throws IOException {
		socket.close();
	}

	// 다른 이용자가 보낸 메세지를 받기
	public void receive() {
		Thread th = new Thread( () -> {
			try {
				while(true) {
					String receiveJson = dis.readUTF();
					JSONObject root = new JSONObject(receiveJson);
					String clientIp = root.getString("clientIp");
					String chatName = root.getString("chatName");
					String message = root.getString("message");
					System.out.println(chatName + "(" + clientIp + ") : " + message);
				}
			} catch (IOException e) {
				// 서버가 강제종료 됐을 때 예외처리
				System.out.println("[알림] 서버와의 연결이 끊어졌습니다.");
				System.exit(0);
			}
		});
		th.start();
	}

	// 이용자들에게 메세지 보내기
	public void send(String json) throws IOException {
		dos.writeUTF(json);
		dos.flush();
	}

	// main
	public static void main(String[] agrs) {
		try {
			ChatClient chatClient = new ChatClient();
			chatClient.connect();

			Scanner sc = new Scanner(System.in);
			System.out.print("대화명을 입력하세요 : ");
			chatClient.chatName = sc.nextLine();

			// JSON객체에 입장 커맨드와 이용자이름을 넣어서 서버측으로 보내기
			// {"command" : "incoming", "data" : "chatName"} 입장
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("command", "incoming");
			jsonObject.put("data", chatClient.chatName);
			String json =  jsonObject.toString();
			chatClient.send(json);

			//서버의 응답을 받기
			chatClient.receive();

			System.out.println("===========================================");
			System.out.println("보낼 메세지를 입력하고 Enter키를 누르세요.");
			System.out.println("채팅을 종료하려면 q 또는 Q를 입력하고 Enter키를 누르세요.");
			System.out.println("===========================================");

			while(true) {
				String message = sc.nextLine();

				if(message.toLowerCase().equals("q")) break;
				else {
					jsonObject =  new JSONObject();
					jsonObject.put("command", "message");
					jsonObject.put("data", message);
					json =  jsonObject.toString();
					chatClient.send(json);
				}
			}

			sc.close();
			chatClient.unconnect();
		} catch (Exception e) {
			System.out.println("[알림] 서버연결이 되지 않았습니다.");
		}

		System.out.println("[알림] 채팅을 종료 하였습니다. ");
	}
}
