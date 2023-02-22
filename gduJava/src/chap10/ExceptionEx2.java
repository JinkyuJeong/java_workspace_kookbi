package chap10;

public class ExceptionEx2 {
	public static void main(String[] args) {
		System.out.print(1);
		try {
			System.out.print(2);
			System.out.print(3);
			System.out.print(4);
			System.out.print(args[0]);
			String s = "abc";
			System.out.println(s.trim());
			System.out.println(Integer.parseInt("a"));
		} catch (ArithmeticException e) {
			System.out.print("5");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("command line에 파라미터를 설정하세요");
		} catch (Exception e) {
			System.out.println("전산부로 연락하세요. 프로그램 오류입니다.");
		}
		System.out.print(6);
	}

}
