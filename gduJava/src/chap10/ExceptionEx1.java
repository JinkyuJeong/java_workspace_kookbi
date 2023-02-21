package chap10;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
			System.out.println(1/0);
			System.out.println(2);
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("command 라인에 파라미터를 입력하세요");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
		System.out.println("프로그램 종료");

	}

}
