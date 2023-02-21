package chap8;

public class InterfaceEx5 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		c.method1();
		MyInterface1.method2();
		MyInterface2.method2();
		c.pmethod();
		
	}

}

interface MyInterface1 {
	void method();
	default void method1() {
		System.out.println("MyInterface1의 default 메서드 : method1()");
	}
	static void method2() {
		System.out.println("MyInterface1의 static 메서드 : method2()");
	}
}

interface MyInterface2 {
	void method();
	default void method1() {
		System.out.println("MyInterface2의 default 메서드 : method1()");
	}
	static void method2() {
		System.out.println("MyInterface2의 static 메서드 : method2()");
	}
}

class Parent {
	public void pmethod() {
		System.out.println("Parent 클래스의 멤버 메서드 : pmethod()");
	}
}

class Child extends Parent implements MyInterface1, MyInterface2{
	@Override
	public void method() {
		System.out.println("Child 클래스의 멤버메서드 : method()");
	}

	@Override
	public void method1() {
		MyInterface1.super.method1();
		MyInterface2.super.method1();
	}
}