package chap7;

public class BindingEx1 {
	public static void main(String[] args) {
		Parent2 p = new Child2();
		System.out.println(p.x);
		Child2 c = (Child2)p;
		System.out.println(c.x);
		p.method();
		c.method();
	}
}

class Parent2{
	int x =10;
	void method() {
		System.out.println("Parent2 클래스의 method");
	}
}

class Child2 extends Parent2 {
	int x=20;
	@Override
	void method() {
		System.out.println("Child2 클래스의 method");
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}
