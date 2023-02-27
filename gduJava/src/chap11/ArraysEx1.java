package chap11;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx1 {

	public static void main(String[] args) {
		String[] arr1 = {"홍길동", "이몽룡", "성춘향", "향단이"};
		for(String s : arr1)
			System.out.print(s+", ");
		System.out.println();
		Arrays.fill(arr1, "김삿갓");
		for(String s : arr1)
			System.out.print(s+", ");
		System.out.println();
		Arrays.fill(arr1,1, 3, "춘향전");
		for(String s : arr1)
			System.out.print(s+", ");
		System.out.println();
		Arrays.sort(arr1);
		for(String s : arr1)
			System.out.print(s+", ");
		System.out.println();
		Arrays.sort(arr1, Comparator.reverseOrder());
		for(String s : arr1)
			System.out.print(s+", ");
		
	}

}
