package chap11;

import java.util.Arrays;

public class StringEx3 {

	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		System.out.println("s.charAt(4) : " + s.charAt(4));
		System.out.println("s.compareTo(\"abc\") : " + s.compareTo("abc"));
		System.out.println("s.compareTo(\"AAA\") : " + s.compareTo("AAA"));
		System.out.println("s.compareToIgnoreCase(\"abc\") : " + s.compareToIgnoreCase("abc"));
		System.out.println("s.endsWith(\"GH\") : " + s.endsWith("GH"));
		System.out.println("s.startsWith(\"AB\") : " + s.startsWith("AB"));
		System.out.println("s.equals(\"ABCDEFGH\") : " + s.equals("ABCDEFGH"));
		System.out.println("s.equalsIgnoreCase(\"abcdefgh\") : " + s.equalsIgnoreCase("abcdefgh"));
		
		s = "This is a String";
		System.out.println("s.indexOf(\'i\') : " + s.indexOf('i'));
		System.out.println("s.indexOf(\'i\', 3) : " + s.indexOf('i', 3));
		System.out.println("s.indexOf(\'Q\') : " + s.indexOf('Q'));
		System.out.println("s.lastIndexOf(\'i\') : " + s.lastIndexOf('i'));
		System.out.println("s.length() : " + s.length());
		System.out.println("s.replace(\"is\",\"QR\") : " + s.replace("is","QR"));
		System.out.println("s.replace(\"is\",\"\") : " + s.replace("is",""));
		System.out.println("s.substring(5) : " + s.substring(5));
		System.out.println("s.substring(5, 13) : " + s.substring(5, 13));
		System.out.println("s.toUpperCase() : " + s.toUpperCase());
		System.out.println("s.toLowerCase() : " + s.toLowerCase());

		s =  "             문자열 trim 메서드               ";
		System.out.println("s : "+s);
		System.out.println("s.trim() : "+s.trim());
		System.out.println("s.length() : "+s.length());
		System.out.println("s.trim().length : "+s.trim().length());
		
		s = "홍길동,이몽룡,김삿갓";
		String[] arr = s.split(",");
		System.out.println(Arrays.toString(arr));
	}

}
