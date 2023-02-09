package chap4;

import java.util.Scanner;

public class LoopEx6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 여러개 입력(종료:999) : ");
		int sum=0;
		while(true) {
			int num = sc.nextInt();
			if(num == 999) break;
			sum+=num;
		}
		System.out.println("입력받은 수의 합: "+sum);
		
			
	}

}
