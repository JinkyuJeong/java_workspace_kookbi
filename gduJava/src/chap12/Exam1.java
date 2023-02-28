package chap12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int sum=0;
		System.out.println("홀수개의 정수를 입력하세요 : ");
		while(true) {
			int num = scan.nextInt();
			if(num == 999) break;
			list.add(num);
			sum+=num;
		}                                               
		if(list.size()%2==0) {
			System.out.println("홀수개의 정수를 입력하세요 : ");
			int num = scan.nextInt();
			list.add(num);
			sum+=num;
		}
		Collections.sort(list);
	
		System.out.println("평균 : " + (double)sum/list.size());
		System.out.println("중간값 : " + list.get(list.size()/2));
	}

}
