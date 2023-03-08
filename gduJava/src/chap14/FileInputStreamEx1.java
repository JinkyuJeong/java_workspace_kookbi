package chap14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/chap14/InputStreamEx1.java");
		int data = 0;
		System.out.println("== read() 메서드를 이용하여 읽기 ==");
		while((data = fis.read()) != -1)
			System.out.print((char)data);
		fis.close();
		System.out.println("== read(byte[]) 메서드를 이용하여 읽기 ==");
		fis = new FileInputStream("src/chap14/InputStreamEx1.java");
		byte[] buf = new byte[fis.available()];
		while((data = fis.read(buf)) != -1)
			System.err.print(new String(buf,0,data));
		fis.close();
		System.out.println("== read(byte[], int start, int len) 메서드를 이용하여 읽기 ==");
		fis = new FileInputStream("src/chap14/InputStreamEx1.java");
		buf = new byte[fis.available()];
		while((data = fis.read(buf,0,buf.length)) != -1)
			System.err.print(new String(buf,0,data));
		fis.close();
		
	}
	

}
