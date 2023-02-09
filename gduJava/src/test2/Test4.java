package test2;

import java.util.Scanner;

/*
 * [결과]
삼각형의 높이를 입력하세요
3
		9			
	8	7	6		
5	4	3	2	1	
 
*/
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이를 입력하세요 : ");
		int h = sc.nextInt();
		int sum =h*h;
		
		for(int i =1; i<=h;i++) {
			for(int j=i;j<=h-1;j++) {
				System.out.print("\t");
			}
			for(int j=1; j<=(2*i)-1;j++) {
				System.out.print(sum--+"\t");
			}
			System.out.println();
		}
	}

}
