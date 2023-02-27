package chap11;

import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
//		System.out.println(today);
		System.out.println("년 : " + today.get(Calendar.YEAR));
		System.out.println("월(0 : 1월) : " + (today.get(Calendar.MONTH)+1));
		System.out.println("년 기준 몇번째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("월 기준 몇번째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("일 : " + today.get(Calendar.DATE));
		System.out.println("월 기준 일자 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("년 기준 일자 : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1 : 일요일) : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("월 기준 요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전(0) 오후(1) : " + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));
		System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59) : " + today.get(Calendar.MINUTE));
		System.out.println("초(0~59) : " + today.get(Calendar.SECOND));
		System.out.println("밀리초(0~999) : " + today.get(Calendar.MILLISECOND));
		System.out.println("TimeZone : " + today.get(Calendar.ZONE_OFFSET)/(1000*60*60));
		System.out.println("이번달의 마지막일자 : " + today.getActualMaximum(Calendar.DATE));
	}

}
