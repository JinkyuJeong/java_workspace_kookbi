package chap14;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileEx3 {
	public static void main(String[] args) throws IOException {
		File f = new File("data1.txt");
		if(!f.exists()) {
			System.out.println("해당 파일은 존재하지 않습니다.");
			return;
		}
		FileInputStream fis = new FileInputStream(f);
		byte[] buf = new byte[8096];
		int len;
		while((len = fis.read(buf)) != -1)
			System.out.print(new String(buf,0,len));
		fis.close();
		f.delete();
	}

}
