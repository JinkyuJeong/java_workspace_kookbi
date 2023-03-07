package chap13;

public class LambdaEx4 {
	public static void main(String[] args) {
		new Outer().method();
	}

}

class Outer {
	public int iv = 10;
	void method() {
		int iv = 20;
		LambdaInterface1 f = () -> {
			System.out.println("iv="+iv);
			System.out.println("this.iv="+this.iv);
			System.out.println("Outer.this.iv="+Outer.this.iv);
		};
		f.method();
	}
}