package chap11;

public class Exam4 {

	public static void main(String[] args) {
		System.out.println(round(3.1215, 1));
		System.out.println(round(3.1215, 2));
		System.out.println(round(3.1215, 3));
		System.out.println(truncate(3.15345, 1));
		System.out.println(truncate(3.15345, 2));
		System.out.println(truncate(3.15345, 3));
		System.out.println(truncate(3.15345, 4));
	}
	
	static double round(double d, int num) {
		return Double.parseDouble(String.format("%." + num +"f",d));
	}
	static double truncate(double d, int num) {
		return (int)(d*Math.pow(10, num))/Math.pow(10, num);
	}
}
