package chap3;

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사과 갯수를 입력 : ");
		int apple = sc.nextInt();
		int box = (apple%10==0) ? apple/10 : apple/10+1; 
		System.out.println("사과 " +apple+"개의 필요한 박스 수는 " + box+"개" );
		
	}

}
