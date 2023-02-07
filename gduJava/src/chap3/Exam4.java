package chap3;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();
		String result = (n>0) ? "양수" : (n==0) ? "영" : "음수";
		String result2 = (n%2==0) ? "짝수" : "홀수";
		System.out.println(n+"은 "+result);
		System.out.println(n+"은 "+result2);
	}
}
