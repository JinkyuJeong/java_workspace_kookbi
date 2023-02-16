package chap7;

public class SuperEx1 {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.x);
		c.method();
	}

}

class Parent{
	int x =10;
	public Parent(int x) {
		this.x=x;
	}
}

class Child extends Parent{
	int x =20;
	public Child() {
		super(100);
	}
	
	void method() {
		int x =30;
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}