package test3;

import java.util.Scanner;

/*
1.  다음은 주어진 문자열(value)이 숫자인지를 판별하는  프로그램을 작성하시오.
  String 함수 charAt(i), length() 을 사용함.
  [결과]
숫자만 입력하세요
123
123는 숫자 입니다.
  
  [결과]
숫자만 입력하세요
123@12
123@12는 숫자가 아닙니다.
 */
public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자만 입력하세요 : ");
		String num = sc.next();
		
		for(int i=0; i<num.length() ;i++) {
			if(num.charAt(i)>='0' && num.charAt(i)<='9' ) continue;
			else {
				System.out.println(num+"은 숫자가 아닙니다.");
				return;
			}
		}
		
		System.out.println(num+"은 숫자 입니다.");
	}

}
