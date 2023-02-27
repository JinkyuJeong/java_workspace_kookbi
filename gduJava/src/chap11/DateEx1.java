package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * yyyy : 년도 4자리
 * MM : 월 2자리
 * dd : 일 2자리
 * HH : 시간 2자리
 * mm : 분 2자리
 * ss : 초 2자리
 * E : 요일
 * a : 오전/오후
 * */
public class DateEx1 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초 E요일 a");
		System.out.println(sf.format(now));
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-M-dd HH:mm:ss");
		String dstr = "2023-12-25 10:00:00";
		Date day = null;
		try {
			day = sf2.parse(dstr);
			System.out.println(day);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-M-dd E요일");
		System.out.println(sf3.format(day));
	}

}
