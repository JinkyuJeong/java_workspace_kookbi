package chap14;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {

	public static void main(String[] args) throws IOException {
		FileReader fis = new FileReader("src/chap14/InputStreamEx1.java");
		int data = 0;
		System.out.println("====== read() 메서드를 이용하여 읽기");
		while((data = fis.read()) != -1)
			System.out.print((char)data);
		System.out.println("====== read(char[]) 메서드를 이용하여 읽기");
		fis = new FileReader("src/chap14/InputStreamEx1.java");
		char[] buf = new char[8000];
		while((data = fis.read(buf)) != -1)
			System.out.print(new String(buf,0,data));
		System.out.println("====== read(char[], int, int) 메서드를 이용하여 읽기");
		fis = new FileReader("src/chap14/InputStreamEx1.java");
		while((data = fis.read(buf,0,buf.length)) != -1)
			System.out.print(new String(buf,0,data));
		
	}

}
