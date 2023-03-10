package chap10;

public class ExceptionEx5 {

	public static void main(String[] args) {
		try {
			first();
		} catch (Exception e) {
			System.out.println("main 메서드에서 예외처리");
		}
	}
	
	private static void first() {
		System.out.println("first 메서드");
		second();
	}
	private static void second() {
		System.out.println("second 메서드");
		try {
			System.out.println(Integer.parseInt("abc"));
		} catch (Exception e) {
			System.out.println("second 메서드에서 예외처리");
			throw e;
		}
	}
}
