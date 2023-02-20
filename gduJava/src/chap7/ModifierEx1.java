package chap7;
import chap7.test.Modifier2;

public class ModifierEx1 extends Modifier2{

	public static void main(String[] args) {
		Modifier m = new Modifier();
		m.method();
//		System.out.println("m.v1="+m.v1);
		System.out.println("m.v2="+m.v2);
		System.out.println("m.v3="+m.v3);
		System.out.println("m.v4="+m.v4);
		Modifier2 m2 = new Modifier2();
		m2.method();
//		System.out.println("m2.v1="+m2.v1);
//		System.out.println("m2.v2="+m2.v2);
//		System.out.println("m2.v3="+m2.v3);
		System.out.println("m2.v4="+m2.v4);
		
	}

}

class Modifier{
	private int v1 = 100;
	int v2 = 200;
	protected int v3 = 300;
	public int v4 =400;
	
	public void method() {
		System.out.println("chap7.Modifier 클래스의 method()");
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		System.out.println("v3="+v3);
		System.out.println("v4="+v4);
	}
}

class Modifier3 extends Modifier2 {
	public void method() {
		System.out.println("chap7.Modifier3 클래스의 method()");
//		System.out.println("v1="+v1);
//		System.out.println("v2="+v2);
		System.out.println("v3="+v3);
		System.out.println("v4="+v4);
	}
}