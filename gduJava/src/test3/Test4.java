package test3;

import java.util.Arrays;

/*
1부터 100까지 임의의 수 10개를  배열에 저장하고, 정렬하여 출력하기
  1. 배열 선언, 생성.
  2. 임의의 수를 10개 배열에 저장
  3. 정렬
  4. 출력
 */
public class Test4 {

	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i=0; i<nums.length;i++) {
			nums[i] = (int)(Math.random()*100)+1; 
		}

		//		Arrays.sort(nums);  <= 이거쓰면 정렬 개빠른데...

		System.out.print("정렬 전 : ");
		for(int a : nums)
			System.out.print(a + " ");
		System.out.println();
		
		for(int i=0;i<nums.length;i++){
			for(int j=0; j<nums.length-1-i;j++) {
				if(nums[j]>nums[j+1]) {
					int tmp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = tmp; 
				}
			}
		}

		System.out.print("정렬 후 : ");
		for(int a : nums)
			System.out.print(a + " ");
		
	}
}
