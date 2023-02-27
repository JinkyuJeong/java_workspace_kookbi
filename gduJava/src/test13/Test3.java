package test13;

import java.util.Scanner;

/*
 * 찾고자 하는 번호의 일부를 입력받아 번호를 출력하기
 * [결과]
 * 찾는 번호의 일부를 입력하세요:
 * 3456
 * 012-3456-7890
 * 013-3456-7890
 */
public class Test3 {
	public static void main(String[] args) {
		String[] phoneNumArr = {
				"012-3456-7890","099-2456-7980", 
				"088-2346-9870","013-3456-7890" };
		Scanner scan = new Scanner(System.in);
		System.out.println("찾는 번호의 일부를 입력하세요 : ");
		String num = scan.next();
		
		for(String s : phoneNumArr) {
			if(s.indexOf(num)>0) System.out.println(s);
		}
	}
}
