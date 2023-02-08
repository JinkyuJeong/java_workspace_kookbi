package chap4;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		System.out.print("문자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		
		if(ch>'A' && ch<'Z')
			System.out.println(ch+"는 대문자");
		else if(ch>'a' && ch<'z')
			System.out.println(ch+"는 소문자");
		else if(ch>'0' && ch<'9')
			System.out.println(ch+"는 숫자");
		else
			System.out.println(ch+"는 기타문자");
	}

}
