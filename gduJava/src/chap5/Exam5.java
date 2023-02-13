package chap5;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이를 입력하세요 : ");
		int len = sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=len;i++)
			sum+=i;
		
		int[][] matrix = new int [len][];
		
		for(int i=0;i<len;i++) 
			matrix[i]= new int[len-i];
		
		for(int i=0;i<len;i++) {
			for(int j=0; j<matrix[i].length;j++) {
				matrix[i][j]= sum--; 
				System.out.printf("%-5d",matrix[i][j]);
			}
			System.out.println();
		}
		
	}
}
