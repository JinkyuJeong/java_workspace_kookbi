package test18;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
1. 반복문을 이용하여 
  파일명을 입력받아서 해당 파일이 존재하면 해당파일명.bak 파일 복사하기
  파일명에 exit 가 입력되면, 프로그램 종료.
  해당 파일이 없으면 해당 파일이 없습니다. 메세지 출력
[결과]
파일명을 입력하세요(종료:exit)
aaa.txt
aaa.txt=>aaa.bak 복사완료
파일명을 입력하세요(종료:exit)
bbb.txt  
복사할 파일이 없습니다.
파일명을 입력하세요(종료:exit)
exit
*/
public class Test1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String fName = null;
		
		while(true) {
			System.out.println("파일명을 입력하세요(종료:exit)");
			fName = sc.nextLine();
			if(fName.equals("exit")) break;
			File f = new File(fName);
			
			if(!f.exists()) {
				System.out.println("복사할 파일이 없습니다.");
				continue;
			}else {
				String bakName = fName.substring(0,fName.indexOf(".")+1)+"bak";
				FileReader fr = new FileReader(f);
				FileWriter fw = new FileWriter(bakName);
				fr.transferTo(fw);
				fw.flush();
				System.out.println("=>" + bakName + " 복사완료");
				fr.close(); fw.close();
			}
		}
		
		sc.close();
	}
}
