package chap9;

public class InnerEx2 {

	public static void main(String[] args) {
		System.out.println("iiv : "+new Outer2().new InstanceInner().iiv);
		System.out.println("iiv2 : "+new Outer2().new InstanceInner().iiv2);
		System.out.println("siv : "+new Outer2.StaticInner().siv);
		System.out.println("scv : "+Outer2.StaticInner.scv);
		
		Outer2 out = new Outer2();
		out.method(200);
		
	}

}

class Outer2 {
	private int outeriv =10;
	private static int outercv =20;
	class InstanceInner{
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	static class StaticInner{
		int siv = new Outer2().outeriv;
		static int scv = outercv;
	}
	void method(int pv) {
		int pv2 = pv+1;	// 지역변수에 변화가 없으면 지역내부클래스는 상수로 판단
		class LocalInner{
			/* (static final) */int liv = outeriv;
			/* (static final) */int liv2 = outercv;
			void method(int num) {
				System.out.println("outeriv : "+outeriv);
				System.out.println("outercv : "+outercv);
				System.out.println("liv : "+liv);
				System.out.println("liv2 : "+liv2);
				System.out.println("pv : "+pv);
				System.out.println("pv2 : "+pv2);
				System.out.println("num : "+num);
			}
		}
		System.out.println("liv : " +new LocalInner().liv);
		System.out.println("liv2 : "+new LocalInner().liv2);
		new LocalInner().method(100);
	}
	
}
