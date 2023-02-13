package chap5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEx8 {

	public static void main(String[] args) {
		int[][] arr = {{10,20}, {30,40}, {50,60}};
//		for(int i=0; i<arr.length;i++) {
//			for(int j=0; j<arr[i].length;j++) {
//				System.out.printf("arr[%d][%d] = %d\n",i,j,arr[i][j]);
//			}
//		}
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println();
		System.out.println("행의 합");
		for(int i =0 ;i<arr.length;i++) {
			int sum=0;
			for(int j =0; j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
			System.out.println(i+"행의 합 : "+sum);
		}
		
		System.out.println();
		System.out.println("열의 합");
		int[] sum= new int[arr[0].length];
		for(int i =0 ;i<arr.length;i++) {
			for(int j =0; j<arr[i].length;j++) {
				sum[j]+=arr[i][j];
			}
		}
		for(int i=0; i<sum.length;i++) 
			System.out.println(i+"열의 합 : "+sum[i]);
	}

}
