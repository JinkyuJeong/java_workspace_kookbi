package test3;

import java.util.Scanner;

/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
 */
public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		String num = sc.next();
		char[] nums = num.toCharArray();
		
		for(int i=0; i<=nums.length/2;i++) {
			if(nums[i]== nums[nums.length -1 - i]) continue;
			else {
				System.out.println(num+"은(는) 대칭수 아님");
				return;
			}
		}
		System.out.println(num+"은(는) 대칭수 맞음");
	}

}
