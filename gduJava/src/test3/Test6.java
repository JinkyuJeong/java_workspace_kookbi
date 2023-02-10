package test3;
/*
 * 1부터 9까지의 숫자 중 중복되지 않는  숫자 3개를 선택하고, 정렬하여 출력하기.
 * 
 * 1. 1 ~ 9 저장한 배열 생성.
 * 2. 선택 숫자를 저장할 배열 선언. 3개 값
 * 3. 1 ~ 9 배열을 섞기.
 * 4. 섞인 배열에서 3개의 숫자를 선택된 배열에 저장
 * 5. 선택된 배열을 정렬하여 출력
 */
public class Test6 {
	public static void main(String[] args) {
		// 1. 1 ~ 9 저장한 배열 생성
		int[] nums = new int[9];
		for(int i=0 ; i<nums.length;i++) 
			nums[i] = i+1; 
		
		// 2. 선택 숫자를 저장할 배열 선언. 3개 값
		int[] selectNums = new int[3];
		
		// 3. 1 ~ 9 배열을 섞기
		for(int i=0; i<=100; i++) {
			int f = (int)(Math.random()*9);
			int t = (int)(Math.random()*9);
			int tmp = nums[f];
			nums[f] = nums[t];
			nums[t] = tmp;
		}
		
		// 4. 섞인 배열에서 3개의 숫자를 선택된 배열에 저장
		for(int i=0; i<selectNums.length;i++)
			selectNums[i] = nums[i];

		
		// 5. 선택된 배열을 정렬하여 출력
		for(int i=0;i<selectNums.length;i++){
			for(int j=0; j<selectNums.length-1-i;j++) {
				if(selectNums[j]>selectNums[j+1]) {
					int tmp = selectNums[j+1];
					selectNums[j+1] = selectNums[j];
					selectNums[j] = tmp; 
				}
			}
		}
		
		for(int a : selectNums)
			System.out.print(a + ",");
	}
}
