package chap4;

import java.util.Scanner;

public class IfEx1 {
	public static void main(String[] args) {
		System.out.print("점수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score >=60)
			System.out.println("합격입니다.");
		else
			System.out.println("불합격입니다.");
		
		if(score>=90)
			System.out.println("A학점");
		else if(score>=80)
			System.out.println("B학점");
		else if(score>=70)
			System.out.println("C학점");
		else if(score>=60)
			System.out.println("D학점");
		else
			System.out.println("F학점");
	}

}
