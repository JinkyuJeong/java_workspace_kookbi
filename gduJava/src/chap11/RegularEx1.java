package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {

	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "car", "combat"
								, "count", "cTT", "data", "disk", "c"};
		Pattern p = Pattern.compile("c[a-zA-z]+");
		/*
		 * c[a-zA-z]?
		 * c : c 문자로 시작
		 * [a-zA-z] : a~z, A~Z (알파벳만)
		 * ? : 0 또는 1개
		 * * : 1개 이상
		 * . : 한자리
		 * */
		for(String s : data) {
			Matcher m = p.matcher(s);
			if(m.matches()) {
				System.out.print(s+", ");
			}
		}
		System.out.println();
		String names = "홍길동,      김삿갓,이몽룡      ,         성춘향     ,  임꺽정";
		String[] arr = names.split("\\s*,\\s*");
		for(String s : arr)
			System.out.println(s);
	}

}
