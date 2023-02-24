package chap11;

public class Exam3 {

	public static void main(String[] args) {
		System.out.println(delChar("(1!2@3^4~5)","~!@#$%^&*()"));
		System.out.println(delChar("(1!2@3^4~5)","12345"));
	}
	
	private static StringBuffer delChar(String s1, String s2) {
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<s1.length();i++) {
//			if(s2.indexOf(s1.charAt(i)+"")<0)
			if(!s2.contains(s1.charAt(i)+""))
				sb.append(s1.charAt(i));
		}
		return sb;
	}
	
}
