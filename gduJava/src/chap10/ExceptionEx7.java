package chap10;


public class ExceptionEx7 {
	public static void main(String[] args) throws InterruptedException  {
		Child c = new Child();
		c.method();
		Thread.sleep(1000);
	}
}

class Parent {
	public void method() throws RuntimeException{
		System.out.println("Parent 클래스의 method()");
	}
}

class Child extends Parent{
	@Override
	public void method() throws RuntimeException{
		System.out.println("Child 클래스의 method()");
	}
}
