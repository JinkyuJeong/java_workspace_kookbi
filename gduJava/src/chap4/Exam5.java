package chap4;

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 입력 : ");
		int num = sc.nextInt();
		int sum =0;
		while(num>0) {
			sum+=num%10;
			num /= 10;
		}
		System.out.println(sum);
	}

}
