package chap14;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("저장할 내용을 입력하세요(ctrl+z)");
		FileWriter fw = new FileWriter("buffered.txt");
		String data = null;
		while((data=br.readLine()) != null){
			System.out.println(data);
			fw.write(data+"\n");
		}
		fw.flush(); fw.close(); br.close();
	}

}
