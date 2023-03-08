package chap14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamEx2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("data.txt");
		System.out.print("저장할 내용을 입력하세요(종료:exit) : ");
		while(true) {
			String data = sc.nextLine();
			if(data.equals("exit")) break;
			fos.write((data+"\n").getBytes());
		}
		fos.flush();
		fos.close();
	}

}
