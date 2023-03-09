package chap14;

import java.io.File;

public class Exam4 {

	public static void main(String[] args) {
		File f = new File("c:\\windows");
		String[] files = f.list();
		int dirCnt = 0, fileCnt=0, fileSize=0;

		for(String s: files) {
			File f2 = new File("c:\\windows", s);
			if(f2.isDirectory())
				dirCnt++;
			else if(f2.isFile()){
				fileCnt++;
				fileSize+=f2.length();
			}
		}
		
		System.out.printf("c:\\windows 폴더의 하위폴더 갯수 : %d개\n", dirCnt);
		System.out.printf("c:\\windows 파일의 갯수 : %d개\n",fileCnt);
		System.out.printf("c:\\windows 파일의 총 크기 : %,dbyte\n", fileSize);
	}
}
