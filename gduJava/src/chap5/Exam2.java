package chap5;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		int[] oct = new int[32];
		System.out.print("8진수로 변환 할 10진수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int divnum =num;
		int index=0;
		while(divnum>0) {
			oct[index++] = divnum%8;
			divnum/=8;
		}
		System.out.print(num+"의 8진수 : ");
		for(int i=index-1 ;i>=0;i--) {
			System.out.print(oct[i]);
		}
	}

}
