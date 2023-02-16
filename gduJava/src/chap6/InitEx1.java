package chap6;
/*
 * 초기화 블럭
 *		static 초기화 블럭 : 클래스 변수의 초기화, 클래스정보 로드시 한 번 실행
 *		인스턴스 초기화 블럭 : 인스턴스 변수의 초기화. 생성자와 기능 겹침 (거의 안씀)
 * */
public class InitEx1 {
	static int cv;
	int iv;
	public InitEx1() {
		System.out.println("5. 생성자 호출됨");
	}
	static {
		cv = (int)(Math.random()*100);
		System.out.println("1. static 초기화 블럭 실행 : cv = "+cv);
	}
	{
		iv = (int)(Math.random()*100);
		System.out.println("4. 인스턴스 초기화 블럭 실행 : iv = "+iv);
	}
	public static void main(String[] args) {
		System.out.println("2. main메서드 시작");
		System.out.println("3. main메서드 init1 객체 생성");
		InitEx1 i1 = new InitEx1();
		System.out.println("3.main메서드 init2 객체 생성");
		InitEx1 i2 = new InitEx1();
	
		
	}

}
