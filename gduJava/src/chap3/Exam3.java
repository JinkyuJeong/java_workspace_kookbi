package chap3;

import java.util.Scanner;

public class Exam3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("세자리 정수를 입력하세요 : ");
		int number = sc.nextInt();
		System.out.println("결과 : " + (number-(number%100)));
	}
}
