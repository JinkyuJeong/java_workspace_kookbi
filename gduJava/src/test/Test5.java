package test;
import java.util.Scanner;
/*
 * 밑변과 높이를 입력받아 삼각형의 넓이를 출력하기. 소숫점을 표시
 * [결과]
 * 밑변의 길이
 * 10
 * 높이의 길이
 * 20
 * 
 * 넓이=10*20 / 2
 */
public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변을 입력하세요 : ");
		int underside = sc.nextInt();
		System.out.print("높이를 입력하세요 : ");
		int height = sc.nextInt();
		System.out.println("넓이 : "+((double)underside*height)/2);
	}

}
