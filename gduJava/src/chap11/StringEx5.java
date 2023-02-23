package chap11;

public class StringEx5 {

	public static void main(String[] args) {
		int i = Integer.valueOf("100");
		System.out.println(i+200);
		Long l = Long.valueOf("100");
		System.out.println(l+200);
		float f = Float.valueOf("100.5");
		System.out.println(f+200);
		double d = Double.valueOf("100.5");
		System.out.println(d+200);
		System.out.println(Integer.parseInt("FF",16));
		System.out.println(Integer.parseInt("11",8));
	}

}
