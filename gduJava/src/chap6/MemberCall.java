package chap6;

public class MemberCall {
	static int cv1 =10;
	static int cv2 =cv1;	// 클래스멤버간 호출
	int iv1= 100;
	int iv2= iv1;	// 인스턴스 멤버간 호출
	int iv3= iv2;	// 인스턴스 멤버에서 클래스멤버 호출
//	static int cv3 = iv1;	// 클래스 멤버에서 인스턴스 멤버 호출 오류
	static int cv3 = new MemberCall().iv1;
	
	void method1() {
		System.out.println("cv1 + cv2 = " + (cv1+cv2));
		System.out.println("iv1 + iv2 = " + (iv1+iv2));
	}
	static void method2() {
		System.out.println("cv1 + cv2 = " + (cv1+cv2));
		// 클래스멤버에서 인스턴스멤버 호출 오류
		MemberCall mc = new MemberCall();
		System.out.println("iv1 + iv2 = " + (mc.iv1+mc.iv2));
	}
	void method3() {
		method1(); method2();
	}
	static void method4() {
		// 클래스멤버에서 인스턴스멤버 호출 오류
		new MemberCall().method1();
		method2();
	}
	
	public static void main(String[] args) {
		// 객체를 생성해서 메서드사용
		// static 메서드는 생성없이 사용
		MemberCall mc = new MemberCall();
		mc.method1();
		method2();
		mc.method3();
		method4();
	}

}
