package test13;

import java.util.Calendar;
import java.util.Scanner;
/*
년도와 월를 입력하세요
2023 02
	2023년2월
   일  월  화   수  목  금   토
               1   2   3   4
   5   6   7   8   9  10  11
  12  13  14  15  16  17  18
  19  20  21  22  23  24  25
  26  27  28
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도와 월을 입력하세요");
		
		int y = scan.nextInt();
		int m = scan.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(y, m-1, 1);
		
		int eDay = cal.getActualMaximum(Calendar.DATE);
		int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println();
		System.out.println("\t\t" + y + "년  " + m + "월" );
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=0 ; i<day_of_week -1; i++) {
			System.out.print("\t");
		}
		for(int i=1, n=day_of_week; i<=eDay ; i++) {
			if(n>7) {
				System.out.println();
				n=1;
			}
			System.out.printf("%d\t",i);
			n++;
		}
	}
}
