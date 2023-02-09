package chap4;

import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이 : ");
		int h = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=h;i++){
			sum+=i;
		}

		for(int i=1 ; i<=h;i++) 
		{
			for(int j=1 ; j<=i-1;j++)
			{
				System.out.print("\t");
			}
			for(int j=i; j<=h;j++)
			{
				System.out.print(sum--+"\t");
			}
			System.out.println();
		}

	}

}
