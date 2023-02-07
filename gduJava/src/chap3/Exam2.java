package chap3;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력하세요 : ");
		int time = sc.nextInt();
		int hour = time/3600;
		int minute = (time%3600)/60;
		int second = time%60;
		System.out.println(hour+"시"+minute+"분"+second+"초");
	}
}
