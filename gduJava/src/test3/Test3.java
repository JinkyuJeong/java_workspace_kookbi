package test3;

import java.util.Scanner;
import java.util.function.IntPredicate;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.text.ChangedCharSetException;

/*
 * 10진수를 2,8,10,16 진수로 변경하기
 * [결과]
10진수 값을 입력하세요
16
16의 2진수 :10000
16의 8진수 :20
16의 10진수 :16
16의 16진수 :10
*/
public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] data = "0123456789ABCDEF".toCharArray();
		int[] bi = new int[10];
		int[] oct = new int[10];
		char[] hex = new char[10];
		System.out.print("10진수 값을 입력하세요 : ");
		int num = sc.nextInt();
		int divnum =num, index=0;
		
		while(divnum>0) {
			bi[index++] = divnum%2;
			divnum/=2;
		}
		System.out.print(num+"의 2진수 : ");
		for(int i=index-1 ;i>=0;i--) 
			System.out.print(bi[i]);
		System.out.println();
		
		divnum = num;
		index = 0;
		while(divnum>0) {
			oct[index++] = divnum%8;
			divnum/=8;
		}
		System.out.print(num+"의 8진수 : ");
		for(int i=index-1 ;i>=0;i--) 
			System.out.print(oct[i]);
		System.out.println();
		
		System.out.println(num+"의 10진수 : "+num);
		
		divnum = num;
		index = 0;
		while(divnum>0) {
			hex[index++] = data[divnum%16];
			divnum /= 16;
		}
		System.out.print(num+"의 16진수 : ");
		for(int i=index-1 ;i>=0;i--) 
			System.out.print(hex[i]);
	
	}
}
