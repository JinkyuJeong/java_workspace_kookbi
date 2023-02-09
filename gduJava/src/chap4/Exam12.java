package chap4;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		int computer = (int)(Math.random()*100)+1;
		System.out.println(computer);
		Scanner sc = new Scanner(System.in);
		int me;
		do {
			System.out.print("1~100사이의 숫자를 입력하세요 : ");
			me = sc.nextInt();

			if(me> computer)
				System.out.println("작은 수 입니다.");
			else if(me <computer)
				System.out.println("큰 수 입니다.");
		}while(me != computer);

		System.out.println("정답입니다."); 
		System.out.println("프로그램 종료");
	}

}
