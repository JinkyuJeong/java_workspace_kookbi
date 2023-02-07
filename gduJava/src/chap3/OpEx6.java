package chap3;

import java.util.Scanner;

public class OpEx6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		System.out.println(score+"점은"+ ((score>=60)? " 합격":" 불합격"));
		String result = (score>=60)? "합격":"불합격";
		System.out.println(score+"점은 "+result);
		
		result = (score>=70) ? "통과" : (score>=60) ?  "재시험대상" : "탈락";
		System.out.println(score+"점은 "+result);
	}

}
