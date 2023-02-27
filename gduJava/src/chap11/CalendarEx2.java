package chap11;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2023, 11, 31);
		toString(cal);
		
		Date now = new Date();
		now.setTime(now.getTime()+(1000*60*60*24));
		System.out.println(now);
		
		cal.setTime(now);
		toString(cal);
		
		Date day = new Date();
		day.setTime(cal.getTimeInMillis());
		System.out.println(day);
	}
	
	private static void toString(Calendar cal) {
		String[] DAY = {"", "일", "월", "화", "수", "목", "금", "토"};
		System.out.println("날짜 : " + cal.get(Calendar.YEAR)+"-"
				+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.DATE) + " "
				+ DAY[cal.get(Calendar.DAY_OF_WEEK)]+"요일");
	}
}