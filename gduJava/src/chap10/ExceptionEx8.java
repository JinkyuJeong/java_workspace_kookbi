package chap10;

public class ExceptionEx8 {

	public static void main(String[] args)  {
		String id = "hong";
		String pw = "1234";
		try {
			if(!id.equals("hong") || !pw.equals("1234")) {
				throw new LoginFailException("아이디나 비밀번호 오류입니다.");
			}
			System.out.println("반갑습니다. hong님.");
			throw new LoginFailException2("RuntimeException 클래스 상속");
		} catch (LoginFailException e) {
			System.out.println(e.getMessage());
		}
	}

}

class LoginFailException extends Exception{
	public LoginFailException(String msg) {
		super(msg);
	}
}

class LoginFailException2 extends RuntimeException{
	public LoginFailException2(String msg) {
		super(msg);
	}
}