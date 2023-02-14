package chap6;

class Phone{
	String color;
	boolean power;
	String no;
	void power() {
		power = !power;
	}
	void send(String no) {
		
		System.out.println(no + "로 전화 거는 중");
	}
	void receive(String no) {
		System.out.println(no + "에서 전화 받는 중");
	}
}

public class PhoneEx1 {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.color = "검정";
		p1.power = true;
		p1.no = "01012345678";
		System.out.println(p1.color +", " + p1.power +", " + p1.no);
		p1.send("01087654321");
		p1.receive("01087654321");
		p1.power();
		System.out.println(p1.color +", " + p1.power +", " + p1.no);
		Phone p2 = new Phone();
		p2.color = "분홍";
		p2.power = true;
		p2.no = "01087654321";
		System.out.println(p2.color +", " + p2.power +", " + p2.no);
		p2=p1;
		System.out.println(p2.color +", " + p2.power +", " + p2.no);
		
	
	}

}
