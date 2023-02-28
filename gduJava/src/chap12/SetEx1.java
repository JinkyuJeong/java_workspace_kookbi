package chap12;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		Object[] arr = {"홍길동", 1, "1", "김삿갓", "이몽룡", "홍길동", "성춘향", "향단이", "홍길동", "김삿갓"};
		Set<Object> set1 = new LinkedHashSet<>();
		Set<Object> set2 = new HashSet<>();
		Set<Object> set3 = new HashSet<>();
		for(int i=0 ;i<arr.length; i++) {
			if(!set1.add(arr[i])) {
				if(!set2.add(arr[i])) {
					if(!set3.add(arr[i]))
						set3.add(arr[i]);
				}
			}
		}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		
		for(Object object : set1)
			System.out.println(object);
		for(Object object : set2)
			System.out.println(object);
		for(Object object : set3)
			System.out.println(object);
	}
}

