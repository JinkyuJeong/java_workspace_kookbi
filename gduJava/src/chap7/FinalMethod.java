package chap7;

public class FinalMethod {
	final static void method() {
		System.out.println("FinalMethod 클래스의 method");
	}
}
class SubMethod extends FinalMethod{
//	void method() {
//		System.out.println("SubMethod 클래스의 method");
//	}
}