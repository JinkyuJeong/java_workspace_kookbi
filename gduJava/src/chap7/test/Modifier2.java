package chap7.test;

import chap7.ModifierEx1;

public class Modifier2 {
	private int v1 = 10;
	int v2 = 20;
	protected int v3 = 30;
	public int v4 =40;
	
	public void method() {
		System.out.println("chap7.test.Modifier2 클래스의 method()");
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		System.out.println("v3="+v3);
		System.out.println("v4="+v4);
	}
}

class Modifier4 {}