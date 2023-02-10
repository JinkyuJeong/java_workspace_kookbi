package chap5;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 5개 입력 : ");
		int[] nums = new int[5];
		int sum=0;
		int maxidx=0, minidx=0;
		for(int i=0; i<nums.length;i++) {
			nums[i]= sc.nextInt();
			sum+=nums[i];
			if(nums[maxidx] < nums[i])
				maxidx =i;
			if(nums[minidx] > nums[i])
				minidx =i;
		}
		
		System.out.println("합계 : " + sum );
		System.out.println("평균 : " + (double)sum/nums.length);
		System.out.println("최대값 : " + nums[maxidx]+ ", 최대값인덱스 : " + maxidx );
		System.out.println("최소값 : " + nums[minidx]+ ", 최소값인덱스 : " + minidx );
	}

}
