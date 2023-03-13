package test19;

import java.util.Random;

/*
 * 1부터 100까지의 정수형 임의의 난수 100개를 저장하고,
 * 그중 소수인 숫자의 목록과, 갯수를 출력하기
 * Random 클래스를 이용
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("1부터 100까지의 임의의 난수100개 중 소수의 목록 : ");
		int count = (int) new Random()
			.ints(100,1,101)
			.filter(n->{
				int cnt = 0;
				for(int i=1; i<=n; i++) {
					if(n%i==0) cnt++;
				}
				return cnt==2;
			})
			.distinct()
			.peek(n->System.out.print(n+", "))
			.count();
		System.out.println("\n소수의 총 갯수 : " + count);
	}
}