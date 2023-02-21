package chap9;

public class InnerEx3 {

	public static void main(String[] args) {
		new Outer3().new InstanceInner().method();
	}

}

class Outer3{
	int iv=10;
	int iv2 =20;
	class InstanceInner{
		int iv=100;
		void method() {
			int iv=300;
			System.out.println("iv="+iv);
			System.out.println("iv2="+iv2);
			System.out.println("this.iv="+this.iv);
			System.out.println("Outer3.this.iv="+Outer3.this.iv);
		}
	}
	
}