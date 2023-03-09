package chap14;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ProcessEx1 {
	public static void main(String[] args) throws IOException {
		Process p = Runtime.getRuntime().exec("ping 192.168.200.1");
		Reader r = new InputStreamReader(p.getInputStream(),"EUC-KR");
		int data = 0;
		while((data = r.read()) != -1) {
			System.out.print((char)data);
		}
	}
}
