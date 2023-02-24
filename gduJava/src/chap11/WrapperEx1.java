 package chap11;

public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i1 = 100;
		Integer i2 = 100;
		System.out.println("i1==i2 : "+(i1==i2));
		System.out.println("100==i2 : "+(100==i2));
		System.out.println("i1.equals(i2) : "+i1.equals(i2));
		
		System.out.println("int형의 최대값 : " + Integer.MAX_VALUE);
		System.out.println("int형의 최소값 : " + Integer.MIN_VALUE);
		System.out.println("int형의 bit크기 : " + Integer.SIZE);
		System.out.println("int형의 byte크기 : " + Integer.SIZE/8);
		
		System.out.println(Integer.parseInt("123")+100);
		System.out.println(Integer.parseInt("12",8)+100);
		System.out.println(Integer.parseInt("10",16)+100);
		System.out.println(Integer.toBinaryString(255));
		System.out.println(Integer.toOctalString(255));
		System.out.println(Integer.toHexString(255));
	}

}
