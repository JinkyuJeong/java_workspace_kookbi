package test13;
/*
124 나라의 숫자
문제 설명
124 나라가 있습니다. 
124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.
124 나라에는 자연수만 존재합니다.
124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.
10진법	124 나라	10진법	124 나라
1	1				6	14
2	2				7	21
3	4				8	22
4	11				9	24
5	12				10	41
자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 
숫자로 바꾼 값을 return 하도록 solution 함수를 완성해 주세요.
제한사항
n은 500,000,000이하의 자연수 입니다.
 */


public class Test4 {
	public static void main(String[] args) {
		System.out.println("1 :" + solution(1));
		System.out.println("2 :" + solution(2));
		System.out.println("3 :" + solution(3));
		System.out.println("4 :" + solution(4));
		System.out.println("5 :" + solution(5));
		System.out.println("6 :" + solution(6));
		System.out.println("7 :" + solution(7));
		System.out.println("8 :" + solution(8));
		System.out.println("9 :" + solution(9));
		System.out.println("10 :" + solution(10));
		System.out.println("11 :" + solution(11));
		System.out.println("12 :" + solution(12));
		System.out.println("13 :" + solution(13));
		System.out.println("14 :" + solution(14));
		System.out.println("15 :" + solution(15));
		System.out.println("16 :" + solution(16));
		System.out.println("17 :" + solution(17));
		System.out.println("18 :" + solution(18));

	}
	
	private static String solution(int num) {
		StringBuffer sb = new StringBuffer();
		while(num>0) {
			if(num%3==0) {
				sb.insert(0, 4);
				num/=3.00000001;
				continue;
			}
			switch(num%3) {
				case 1 : sb.insert(0, 1); break;
				case 2 : sb.insert(0, 2); break;
			}
			num/=3;
		}
		return sb.toString();
	}
}