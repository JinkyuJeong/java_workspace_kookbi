package exam1;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 크기 n(1~10)과 종류 m(1~3)을 입력 : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		switch(m){
		 case 1 : {
			 for(int i=1;i<=n;i++) {
				 for(int j=1;j<=i;j++) 
					 System.out.print("*");
				 System.out.println();
			 }
			 break;
		 }
		 case 2 : {
			 for(int i=1;i<=n;i++) {
				 for(int j=i;j<=n;j++) 
					 System.out.print("*");
				 System.out.println();
			 }
			 break;
		 }
		 case 3 : {
			 for(int i=1;i<=n;i++) {
				 for(int j=i;j<=n-1;j++) 
					 System.out.print(" ");
				 for(int j=1;j<=i*2-1;j++) 
					 System.out.print("*");
				 System.out.println();
			 }
			 break;
		 }
		 default : System.out.println("1~3 사이값만 입력하세요");
		}
		
	}
}
