package test19;

import java.util.ArrayList;
import java.util.Scanner;

public class Test4_subin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("정수를 입력하세요 : ");
		while(true) {
			int num = sc.nextInt();
			if(num==0) break;
			list.add(num);
		}
		
		System.out.println("합 : " +list.stream().mapToInt(i->i).sum());
//		System.out.println("합 : " +list.stream().reduce(0,((i1,i2)-> i1+i2))); 		//   이렇게도 가능함
		System.out.println("짝수 합 : " + list.stream().mapToInt(i->i).filter(i->i%2==0).sum());
		System.out.println("홀수 합 : " + list.stream().mapToInt(i->i).filter(i->i%2==1).sum());
		
	}

}
