package chap2;

public class VarEx5 {

	public static void main(String[] args) {
		String str = "abc";
		String str1 = str+100;
		System.out.println(str1);
		String str2 = str+true;
		System.out.println(str2);
		String str3 = str+1+2+3;
		System.out.println(str3);
		String str4 = 1+2+3+str;
		System.out.println(str4);
		
	}

}
