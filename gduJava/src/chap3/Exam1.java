package chap3;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		int x = 10;
		System.out.println("2. x="+ --x);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		x = sc.nextInt();
		System.out.println("1. x="+ x++);
		System.out.println("2. x="+ --x);
	}

}
