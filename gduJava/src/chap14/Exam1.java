package chap14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileWriter fos = new FileWriter("data2.txt");
		System.out.println("저장할 내용을 입력하세요(종료:exit) : ");
		while(true) {
			String data = sc.nextLine();
			if(data.equals("exit")) break;
			fos.write(data+"\n");
		}
		fos.flush();
		fos.close();
		sc.close();
	}

}
