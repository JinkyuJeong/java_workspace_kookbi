package chap13;

import java.util.function.IntPredicate;

public class Exam1 {
	private static int[] arr = new int[10];
	
	public static void main(String[] args) {
		for(int i=0; i<arr.length ; i++) {
			arr[i]= (int)(Math.random()*100)+1;
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		System.out.println("홀수 : " + numList(i->i%2==1));
		System.out.println("짝수 : " + numList(i->i%2==0));
	}
	
	private static String numList(IntPredicate p) {
		StringBuffer sb = new StringBuffer();
		int sum=0;
		for(int a : arr) {
			if(p.test(a)) {
				sb.append(a+", ");
				sum+=a;
			}
		}
		sb.append("합은 " + sum);
		return sb.toString();
	}
}

