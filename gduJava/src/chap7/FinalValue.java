package chap7;
// 명시적 초기화가 된 상태면 생성자에서 초기화 불가능

public class FinalValue {

	public static void main(String[] args) {
		final int NUM=100;
		FinalV f = new FinalV(100);
		FinalV f1 = new FinalV(200);
		System.out.println(f.NUM);
		System.out.println(f1.NUM);
		final int[] arr = {10,20,30,40,50};
		arr[0]=100;
	}
}

class FinalV {
	final int NUM;			// final상수는 초기화해서 사용해야한다.
	public FinalV(int num) {
		// TODO Auto-generated constructor stub
		this.NUM = num;		// final상수는 생성자에서 한 번 초기화 가능, 객체별로 다른 상수값
	}
}