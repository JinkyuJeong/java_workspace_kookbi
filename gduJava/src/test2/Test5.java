package test2;

import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
3
*****
 ***
  *
 
 */
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이를 입력하세요 : ");
		int h = sc.nextInt();
		
		for(int i=1;i<=h;i++) {
			for(int j=1; j<i;j++) 
				System.out.print(" ");
			for(int j=i;j<=(h*2)-i;j++) 
				System.out.print("*");
			System.out.println();
		}
	}

}
