package chap15;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Exam1 {
	public static void main(String[] args) {
		int[] num = new int[100];
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*100)+1;
		}
		IntStream is = Arrays.stream(num);
		
		System.out.print("1~100개 임의의 수 10개 : " ); 
		is.forEach(i->System.out.print(i+", "));
		System.out.println();
		System.out.println("1~100임의의 수 100개 총합 : " + Arrays.stream(num).sum());
		System.out.println("1~100임의의 수 100개 평균 : " + Arrays.stream(num).average().getAsDouble());
		System.out.println("1~100임의의 수 100개 짝수 평균 : " + Arrays.stream(num).filter(i->i%2==0).average().getAsDouble());
		System.out.println("1~100임의의 수 100개 짝수 개수 : " + Arrays.stream(num).filter(i->i%2==0).count());
		System.out.println("1~100임의의 수 100개 홀수 평균 : " + Arrays.stream(num).filter(i->i%2==1).average().getAsDouble());
		System.out.println("1~100임의의 수 100개 홀수 개수 : " + Arrays.stream(num).filter(i->i%2==1).count());
		System.out.println("1~100임의의 수 100개 개수(중복x) : " + Arrays.stream(num).distinct().count());
		System.out.println("1~100임의의 수 100개 짝수 평균(중복x) : " + Arrays.stream(num).distinct().filter(i->i%2==0).average().getAsDouble());
		System.out.println("1~100임의의 수 100개 짝수 개수(중복x) : " + Arrays.stream(num).distinct().filter(i->i%2==0).count());
		System.out.println("1~100임의의 수 100개 홀수 평균(중복x) : " + Arrays.stream(num).distinct().filter(i->i%2==1).average().getAsDouble());
		System.out.println("1~100임의의 수 100개 홀수 개수(중복x) : " + Arrays.stream(num).distinct().filter(i->i%2==1).count());
		
	}

}
