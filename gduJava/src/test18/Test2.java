package test18;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
src/chap14 폴더의 .java 파일 중 InputStream 관련 모든 소스 내용을  
InputStream예제.txt  파일 하나에 저장 하기
InputStream 관련 모든 소스 : XXXInputStreamXXX.java

InputStream예제.txt 파일 참조
 */
public class Test2 {
	public static void main(String[] args) throws IOException {
		File f = new File("src/chap14");
		String[] files = f.list();
		for(String s: files) {
			File f2 = new File(f,s);
			if(s.indexOf("InputStream") != -1 && s.endsWith(".java") && f2.isFile()) {
				FileReader fr = new FileReader("src/chap14/"+f2);
				FileWriter fw = new FileWriter("InputStream예제.txt", true);
				fw.write("\n\n************"+ s +"*************\n\n");
				fr.transferTo(fw);
				fw.flush();
				System.out.println(s + "복사완료");
				fr.close(); fw.close();
			}
		}
	}
}
