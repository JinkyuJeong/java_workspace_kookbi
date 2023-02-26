package tcpChatProgram;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.json.JSONObject;

public class SocketClient {
	/* ==== iv필드 ==== */
	
	ChatServer chatServer;
	Socket socket;
	String chatName;
	String clientIp;
	// 보조스트림 (기본형 입출력)
	DataInputStream dis;
	DataOutputStream dos;

	/* ==== 생성자 ==== */
	public SocketClient(ChatServer chatServer, Socket socket) {
		try {
			this.chatServer = chatServer;
			this.socket = socket;
			this.dis = new DataInputStream(socket.getInputStream());
			this.dos = new DataOutputStream(socket.getOutputStream());
			// getRemoteSocketAddress() 메서드의 반환타입 SocketAddress(추상클래스)이므로 InetSocketAddress로 강제 형변환
			InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
			this.clientIp = isa.getHostString();		// 호스트IP를 얻음
			receive();
		} catch (IOException e) {

		}
	}

	/* ==== method 필드 ==== */

	// 데이터 받기
	// 이용자가 채팅방에 들어왔거나 메세지를 보냈을 때 다른 이용자들이 그 메세지를 받는다.
	public void receive() {
		// 쓰레드Pool 이용
		chatServer.threadPool.execute( () -> {
			try {
				while(true) {
					// JSON문자열을 파싱하여 JSON객체 생성
					String receiveJson= dis.readUTF();
					JSONObject jsonObject = new JSONObject(receiveJson);
					String command = jsonObject.getString("command");
					
					switch(command) {
						// {"command" : "incoming", "data" : "chatName"} 입장
						case "incoming" :
							this.chatName = jsonObject.getString("data");
							chatServer.sendToAll(this, "님이 입장 하셨습니다.");
							chatServer.addSocketClient(this);
							break;
						// {"command" : "message", "data" : "content"} 메세지
						case "message" :
							String message = jsonObject.getString("data");
							chatServer.sendToAll(this, message);
							break;
					}	
				}
			}catch(IOException e) {
				chatServer.sendToAll(this, "님이 퇴장 하셨습니다.");
				chatServer.removeSocketClient(this);
			}
		});
	}
	
	// 데이터 보내기
	public void send(String json) {
		try {
			dos.writeUTF(json);
			dos.flush();
		} catch (IOException e) {
		}
	}

	// 소켓닫기
	public void close() {
		try {
			socket.close();
		} catch (IOException e) {
		}
	}

}
