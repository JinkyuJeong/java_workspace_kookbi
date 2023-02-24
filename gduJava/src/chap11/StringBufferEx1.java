package chap11;

public class StringBufferEx1 {
	public static void main(String args[]) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		if(sb1==sb2) System.out.println("sb1==sb2");
		else System.out.println("sb1!=sb2");
		if(sb1.equals(sb2)) System.out.println("sb1==sb2");
		else System.out.println("sb1!=sb2");
		if(sb1.toString().equals(sb2.toString())) System.out.println("sb1.toString().equals(sb2.toString())");
		else System.out.println("!sb1.toString().equals(sb2.toString())");
	}

}

/*
 * StringBuffer / StringBuilder : 동적문자열
 * 
 * */
