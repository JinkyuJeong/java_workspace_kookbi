package chap4;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%2==0)
			System.out.println(num+"은 짝수");
		else
			System.out.println(num+"은 홀수");
		
		if(num>0)
			System.out.println(num+"은 양수");
		else if(num<0)
			System.out.println(num+"은 음수");
		else
			System.out.println(num+"은 0");
	}

}
