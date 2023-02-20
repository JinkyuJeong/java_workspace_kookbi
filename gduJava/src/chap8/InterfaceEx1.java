package chap8;
/*
 *  1. 인터페이스의 멤버는 상수, 추상메서드, default메서드, static메서드만 가능(public)
 *  	상수 : public static final
 *  	추상메서드 : public abstract
 *  	default메서드 : public default => 구현부 존재 
 *  	static메서드 : public static => 구현부 존재 
 *  
 *  2. 객체화 불가 => 구현클래스의 객체화를 통해서 객체화됨.
 *  3. 클래스와 인터페이는 구현으로 표현함 => implements 예약어 사용 (다중상속)
 *  4. 인터페이스간의 상속이 가능 
 * */
public class InterfaceEx1 {

	public static void main(String[] args) {
		Complexer c = new Complexer();
		System.out.println("기본잉크량 : "+Complexer.INK);
		System.out.println("기본잉크량 : "+Complexerable.INK);
		System.out.println("기본잉크량 : "+Printerable.INK);
		System.out.println("팩스 번호 : " +Complexer.FAX_NO);
		System.out.println("팩스 번호 : " +Complexerable.FAX_NO);
		System.out.println("팩스 번호 : "+Faxable.FAX_NO);
		c.print();
		c.scan();
		c.receive("02-2222-3333");
		c.send("02-3333-4444");
		System.out.println("c.ink : "+c.ink);
		if(c instanceof Complexerable) {
			System.out.println("c 객체는 Complexerable 객체임");
			System.out.println("c 객체는 Complexerable타입의 참조변수로 참조가 가능함");
			Complexerable cc = c;
			cc.print();
			cc.scan();
			c.receive("02-2222-5533");
			c.send("02-3333-7777");
//			System.out.println("cc.ink : "+cc.ink); // 에러
			System.out.println("c.ink : "+c.ink);
		}
		if(c instanceof Printerable) {
			System.out.println("c 객체는 Printerable 객체임");
			System.out.println("c 객체는 Printerable타입의 참조변수로 참조가 가능함");
			Printerable p = c;
			p.print();
//			p.scan();
//			p.receive("02-2222-5533");
//			p.send("02-3333-7777");
//			System.out.println("p.ink : "+p.ink); // 에러
		}
		if(c instanceof Scannerable) {
			System.out.println("c 객체는 Scannerable 객체임");
			System.out.println("c 객체는 Scannerable타입의 참조변수로 참조가 가능함");
			Scannerable s = c;
			s.scan();
		}
		if(c instanceof Faxable) {
			System.out.println("c 객체는 Faxable 객체임");
			System.out.println("c 객체는 Faxable타입의 참조변수로 참조가 가능함");
			Faxable f = c;
			f.receive("02-5522-5533");
			f.send("02-3333-7777");
		}

	}

}

interface Printerable {
	int INK =100;
	void print();
}
interface Scannerable {  void scan();  }
interface Faxable {
	String FAX_NO ="02-1111-2222";
	void send(String no);
	void receive(String no);
}
interface Complexerable extends Printerable, Scannerable, Faxable{}

class Complexer implements Complexerable{
	int ink;
	public Complexer() {  this.ink = INK;  }
	@Override
	public void send(String no) {
		System.out.println(FAX_NO+"에서 "+no+"로 FAX를 전송합니다.");
	}
	@Override
	public void receive(String no) {
		System.out.println(no+"에서 "+FAX_NO+"로 FAX를 받았습니다.");
	}
	@Override
	public void scan() {
		System.out.println("이미지를 스캔하여 파일에 저장합니다.");
	}
	@Override
	public void print() {
		System.out.println("프린트를 출력합니다. 남은 잉크량 : "+ --ink);
	}
}
