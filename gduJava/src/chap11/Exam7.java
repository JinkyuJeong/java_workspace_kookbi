package chap11;

import java.util.Calendar;
import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도와 월을 입력하세요 : ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		Calendar cal = Calendar.getInstance();
//		cal.clear();
//		cal.set(Calendar.YEAR, year);
//		cal.set(Calendar.MONTH, month-1);
		cal.set(year, month-1,1);
		cal.set(year, month-1,cal.getActualMaximum(Calendar.DATE));
		String[] DAY = {"", "일", "월", "화", "수", "목", "금", "토"};
		System.out.println("마지막날짜 : " + cal.get(Calendar.YEAR)+"-"
				+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.DATE) + " "
				+ DAY[cal.get(Calendar.DAY_OF_WEEK)]+"요일");
	}

}
