package chap14;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx1 {

	public static void main(String[] args) throws IOException {
		FileWriter fos = new FileWriter("out2.txt");
		fos.write('1');fos.write('2'); fos.write('3');
		fos.write('a');fos.write('b'); fos.write('c');
		fos.write('가');fos.write('나'); fos.write('다');
		fos.flush();
		char[] buf = "\nFileWriter 예제입니다.\n".toCharArray();
		fos.write(buf);
		fos.write(buf,5,6);
		fos.write("\nFileWriter 예제입니다. : String 자료형 출력하기. \n");
		fos.flush();
	}

}
