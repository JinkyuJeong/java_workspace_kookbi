package chap14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/chap14/InputStreamEx1.java");
		FileOutputStream fos = new FileOutputStream("InputStreamEx1.bak");
		
		byte[] buf = new byte[fis.available()];
		int data = 0;
		while((data = fis.read(buf)) != -1) {
			fos.write(buf,0,data);
		}
		fos.flush();
		fis.close();
		fos.close();
	}

}

