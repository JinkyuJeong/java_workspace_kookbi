package chap5;

import java.util.Scanner;

public class ArrayEx5 {
	public static void main(String[] args) {
		char[] data = "0123456789ABCDEF".toCharArray();
		char[] hex = new char[10];
		System.out.print("16진수로 변환 할 10진수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int divnum = num;
		int index = 0;
		
		while(divnum>0) {
			hex[index++] = data[divnum%16];
			divnum /= 16;
		}
		
		System.out.print(num+"의 16진수 : ");
		for(int i=index-1 ;i>=0;i--) {
			System.out.print(hex[i]);
		}
	}

}
