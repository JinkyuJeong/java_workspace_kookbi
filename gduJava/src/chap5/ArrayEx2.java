package chap5;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50}; 			// 생성, 선언, 초기화
		for(int i = 0 ;i<arr.length;i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
		System.out.println();
		for(int a : arr)
			System.out.println(a);
		
		arr = new int[] {100, 200, 300};
		System.out.println();
		for(int a : arr)
			System.out.println(a);
	}

}
