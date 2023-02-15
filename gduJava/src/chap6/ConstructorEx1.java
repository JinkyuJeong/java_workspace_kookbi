package chap6;

class Number1{
	int num;
}
class Number2{
	int num;
	public Number2(int n) {
		this.num = n;
	}
}


public class ConstructorEx1 {
	
	public static void main(String[] args) {
		/*
		 * new 예약어 기능
		 * 1. 메모리 할당
		 * 2. 기본값으로 초기화
		 * 3. 생성자 호출 => 클래스에 구현된 생성자 형태로 호출해야함
		 * 
		 * */
		Number1 n1 = new Number1();
		Number2 n2 = new Number2(10);
		System.out.println(n1.num);
		System.out.println(n2.num);
	}

}
