package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx2 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.getTime());
		System.out.println(System.currentTimeMillis());
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = null;
		try {
			d = sf.parse("2023-03-01");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(d);
		System.out.println(new SimpleDateFormat("E요일").format(d));
		System.out.println(d.getTime());
		d.setTime((1000*60*60*24*5)+d.getTime());
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(d));
		
	}

}
