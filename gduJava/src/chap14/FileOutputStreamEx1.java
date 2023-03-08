package chap14;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx1 {

	public static void main(String[] args) throws IOException {
		System.out.println("out.txt 파일에 내용이 저장됩니다.");
		FileOutputStream fos = new FileOutputStream("out.txt");
		fos.write('1');fos.write('2'); fos.write('3');
		fos.write('a');fos.write('b'); fos.write('c');
		fos.write('가');fos.write('나'); fos.write('다');
		fos.flush();
		byte[] buf = "\nFileOutputStream 예제입니다.\n".getBytes();
		fos.write(buf);
		fos.write(buf,5,6);
		fos.flush();
	}

}
