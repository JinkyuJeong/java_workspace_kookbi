package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도와 월을 입력하세요 : ");
		String year = sc.next();
		String month = (sc.nextInt()+1)+"";
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMM-dd");
		Date d = null;
		try {
			d=sf.parse(year+month+"-01");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		d.setTime(d.getTime() - 1000*60*60*24);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd일 E요일").format(d));
	}

}
