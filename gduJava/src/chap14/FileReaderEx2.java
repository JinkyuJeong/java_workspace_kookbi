package chap14;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileReaderEx2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		System.out.println("C:\\euckr.txt 파일 읽기 =================");
		FileReader fr = new FileReader("C:\\euckr.txt", Charset.forName("EUC-KR"));
		int data =0;
		while((data = fr.read()) != -1)
			System.out.print((char)data);
		System.out.println();
		System.out.println();
		System.out.println("C:\\utf8.txt 파일 읽기 =================");
		fr = new FileReader("C:\\utf8.txt");
		while((data = fr.read()) != -1)
			System.out.print((char)data);
		fr.close();
	}

}
