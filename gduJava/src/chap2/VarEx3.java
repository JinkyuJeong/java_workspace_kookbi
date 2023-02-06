package chap2;

public class VarEx3 {
	public static void main(String agrs[]) {
		byte b1 = 10;
		short s1 = 20;
		int i1 = 30;
		long l1 = 40;
		float f1 = i1;
		System.out.println("i1 = " + i1);
		System.out.println("f1 = " + f1);
		System.out.println("f1+0.5 = " + (f1+0.5));
		System.out.println("i1+0.5 = " + (i1+0.5));
		System.out.println("(int)i1+0.5 = " + (int)(i1+0.5));		// int 형변환
	}
}
