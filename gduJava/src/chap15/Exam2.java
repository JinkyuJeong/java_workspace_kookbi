package chap15;

import java.util.Random;

public class Exam2 {

	public static void main(String[] args) {
		System.out.print("1~100개 임의의 수 100개 : " ); 
		new Random(1000).ints(100,1,101).forEach(i->System.out.print(i+", "));
		System.out.println();
		System.out.println("1~100임의의 수 100개 총합 : " + new Random(1000).ints(100,1,101).sum());
		System.out.println("1~100임의의 수 100개 평균 : " + new Random(1000).ints(100,1,101).average().getAsDouble());
		System.out.println("1~100임의의 수 100개 짝수 평균 : " + new Random(1000).ints(100,1,101).filter(i->i%2==0).average().getAsDouble());
		System.out.println("1~100임의의 수 100개 짝수 개수 : " + new Random(1000).ints(100,1,101).filter(i->i%2==0).count());
		System.out.println("1~100임의의 수 100개 홀수 평균 : " + new Random(1000).ints(100,1,101).filter(i->i%2==1).average().getAsDouble());
		System.out.println("1~100임의의 수 100개 홀수 개수 : " + new Random(1000).ints(100,1,101).filter(i->i%2==1).count());
	}

}
