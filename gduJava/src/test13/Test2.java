package test13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 두개의 날짜를 입력받아서 두날짜사이의 일수를 출력하기
  [결과]
첫번째 날짜를 입력하세요(yyyy-MM-dd)
2023-01-01
두번째 날짜를 입력하세요(yyyy-MM-dd)
2023-01-03
2023-01-03 -2023-01-01 일자의 차이 : 2  
 */
public class Test2 {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("첫번째 날짜를 입력하세요(yyyy-MM-dd)");
		Date eDay = sdf.parse(scan.next());
		System.out.println("두번째 날짜를 입력하세요(yyyy-MM-dd)");
		Date sDay = sdf.parse(scan.next());
		System.out.println(sdf.format(sDay) + ", " + sdf.format(eDay) + " 일자의 차이 : " 
				+ Math.abs((eDay.getTime()-sDay.getTime())/(1000*60*60*24)));
	}
}
