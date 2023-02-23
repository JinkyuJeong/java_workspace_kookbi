package chap11;

public class Exam2 {

	public static void main(String[] args) {
		System.out.println(count("12345AB12AB45AB","12"));
		System.out.println(count("12345AB12AB45AB","AB"));
		System.out.println(count("12345","6"));
	}
	
	private static int count(String s1, String s2) {
		int cnt =0, index=0;
		while(true) {
			index = s1.indexOf(s2, index);
			if(index<0) break;
			cnt++;
			index++;
		}
		return cnt;
	}
	

}
