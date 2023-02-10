package chap5;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		
		for(int i=0; i<arr.length;i++){
			System.out.println("arr["+i+"]="+arr[i]);
		}
		System.out.println();
		
		int[] arr2 = new int[3];
		arr2[0]=100;
		arr2[1]=200;
		for(int i=0; i<arr2.length;i++){
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		System.out.println();
		arr2=arr;
		for(int i=0; i<arr2.length;i++){
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		arr[3]=555;
		System.out.println();
		for(int i=0; i<arr2.length;i++){
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		System.out.println();
		
		// for-each
		for(int i : arr)
			System.out.println(i);
	}

}
