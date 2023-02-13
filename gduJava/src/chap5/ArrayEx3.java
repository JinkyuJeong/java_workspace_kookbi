package chap5;

import java.util.Arrays;

public class ArrayEx3 {

	public static void main(String[] args) {
//		int[] lotto1 = new int[6];
//		for(int i = 0;i<lotto1.length;i++) {
//			lotto1[i] = (int)(Math.random()*45)+1;
//		}
//		for(int a : lotto1)
//			System.out.print(a+" ");
//		System.out.println();
		
		int[] balls = new int[45];
		int[] lotto = new int[6];
		for(int i=0; i<balls.length;i++) {
			balls[i]=i+1;
		}
		
		for(int i=0; i<=1000; i++) {
			int f = (int)(Math.random()*45);
			int t = (int)(Math.random()*45);
			int tmp = balls[f];
			balls[f] = balls[t];
			balls[t] = tmp;
		}
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = balls[i];
		}
		for(int b : lotto)
			System.out.print(b+", ");
		System.out.println();
		
//		Arrays.sort(lotto);
//		for(int b : lotto)
//			System.out.print(b+", ");
		
		for(int i=0;i<lotto.length;i++){
			for(int j=0; j<lotto.length-1-i;j++) {
				if(lotto[j]>lotto[j+1]) {
					int tmp = lotto[j+1];
					lotto[j+1] = lotto[j];
					lotto[j] = tmp; 
				}
			}
		}
		
		for(int b : lotto)
			System.out.print(b+", ");
		
	}
}
