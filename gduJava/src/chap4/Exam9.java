package chap4;

import java.util.Scanner;

public class Exam9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("강아지 병아리 마리수를 입력하세요 : ");
		int animal = sc.nextInt();
		System.out.print("강아지 병아리 전체 다리수를 입력하세요 : ");
		int leg = sc.nextInt();
		
		for(int i =1; i<=animal; i++) {
			for(int j =1; j<=animal; j++) {
				if((i+j == animal) && ((4*i)+(2*j)==leg)) {
					System.out.printf("강아지 : %d마리, 병아리 : %d마리",i,j); 
					return;
				}
			}
		}
		System.out.println("계산불가");
	}

}
