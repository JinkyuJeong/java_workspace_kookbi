package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx4 {

	public static void main(String[] args) {
		String data = "번호:1,이름:홍길동,국어:100,영어:70,수학:85,과학:95";
		Pattern p =Pattern.compile("\\d{2,3}");
		Matcher m = p.matcher(data);
		int sum=0, i=0;
		// boolean find() : 패턴에 일치하는 문자열 검색 
		while(m.find()) {
			System.out.print(m.group()+", ");
			i++;
			sum+= Integer.parseInt(m.group());
		}
		System.out.println("총점 : " + sum +", 평균 : "+(double)sum/i);
	}

}
