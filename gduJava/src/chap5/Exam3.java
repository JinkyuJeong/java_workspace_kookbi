package chap5;

import javax.xml.crypto.Data;

public class Exam3 {

	public static void main(String[] args) {
		String str = "aaaaabbbbbbbbbbccccccgkfjglwjfioejfisdf";
		char[] strData = str.toCharArray();
		int[] count = new int[26];

		for(char ch : strData) {
			count[ch-'a']++;
		}

		for(int i =0 ; i<=count.length-1;i++) {
			if(count[i]>0) {
				System.out.print((char)(i+'a') + " : " + count[i]+ "개 => "  );
				for(int j=0;j<count[i];j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
