package chap6;

public class MethEx1 {
	public static void main(String[] args) {
		Meth1 m1 = new Meth1();
		int a1 = m1.add1(10, 20);
		System.out.println(a1);
		long a2 = m1.add2(10, 20);
		System.out.println(a2);
		m1.add3(10, 20);
		
	}

}

class Meth1{
	int add1(int a, int b) {
		return a+b;
	}
	long add2(int a, int b) {
		return a+b;
	}
	void add3(int a, int b) {
		System.out.println(a+b);
	}
}
