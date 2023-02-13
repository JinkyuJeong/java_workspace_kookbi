package chap5;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이를 입력하세요 : ");
		int h = sc.nextInt();
		
		int[][] arr = new int[h][];
		
		for(int i=0; i<arr.length;i++) 
			arr[i] = new int[i];
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++)
				System.out.printf("%-3d",arr[i][j]);
			System.out.println();
		}
	}

}
