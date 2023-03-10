package test19;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
화면에서 정수를 입력받아 
입력된 숫자까지의 합, 짝수의 합, 홀수의 합을 구하는 프로그램 작성하기
IntStream.rangeClosed
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println("1부터 입력된 숫자 " + num +"까지의 합 : " + IntStream.rangeClosed(1, num).sum());
		System.out.println("1부터 입력된 숫자 " + num +"까지의 짝수 합 : " + IntStream.rangeClosed(1, num).filter(i->i%2==0).sum());
		System.out.println("1부터 입력된 숫자 " + num +"까지의 홀수 합 : " + IntStream.rangeClosed(1, num).filter(i->i%2==1).sum());
		
		
	}
	
}
