package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx3 {
	public static void main(String[] args) {
		String source = "핸드폰:010-1111-1111,집:02-123-5678,"+"이메일:regular@aaa.bbb,계좌번호:301-01-123456";
		String telPattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		/*
		 *  () : 그룹
		 *  0\\d{1,2} : 0으로 시작 숫자 1~2개
		 *  \\d{3,4} : 숫자 3~4개
		 *  \\d{4} : 숫자 4개
		 * */
		Pattern p =Pattern.compile(telPattern);
		Matcher m = p.matcher(source);
		int i=0;
		System.out.println("전화번호 : ");
		while(m.find()) {
			System.out.println(++i + ":"+m.group()+"=>"+m.group(1)+", "+m.group(2)+", "+m.group(3));
		}
		
		i=0;
		String emailPattern = "(\\w+)@(\\w+).(\\w+)";
		p =Pattern.compile(emailPattern);
		m = p.matcher(source);
		System.out.println("이메일 : ");
		while(m.find()) {
			System.out.println(++i + ":"+m.group()+"=>"+m.group(1)+", "+m.group(2)+", "+m.group(3));
		}
		
		i=0;
		String accountPattern = "(\\d{3})-(\\d{2})-(\\d+)";
		p =Pattern.compile(accountPattern);
		m = p.matcher(source);
		System.out.println("계좌번호 : ");
		while(m.find()) {
			System.out.println(++i + ":"+m.group()+"=>"+m.group(1)+", "+m.group(2)+", "+m.group(3));
		}
	}

}
