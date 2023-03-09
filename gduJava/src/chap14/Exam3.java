package chap14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일명을 입력하세요 ");
		BufferedReader stdin= new BufferedReader(new FileReader(br.readLine()));
		System.out.println("시작라인:");
		int start = Integer.parseInt(br.readLine().trim());
		System.out.println("라인 수:");
		int len = Integer.parseInt(br.readLine().trim());
		String data = null;
		int line = 1;
		
		while((data=stdin.readLine()) != null){
			if(start<=line) {
				System.out.println(line +" : " + data);
				line++;
				if(line == len+start) break;
			}
			else line++;
		}
		
		br.close(); stdin.close();
	}

}
