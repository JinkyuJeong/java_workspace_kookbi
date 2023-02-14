package chap6;

public class StaticValEx1 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		c1.color = "white";
		c1.num = 1234;
		c1.sno = ++Car2.cnt;
		System.out.println(c1);
		Car2 c2 = new Car2();
		c2.color = "black";
		c2.num = 5678;
		c2.sno = ++Car2.cnt;
		
		System.out.println(c1);
		System.out.println(c2);
	}

}

class Car2 {
	String color;
	int num;
	int sno;
	static int cnt;
	@Override
	public String toString() {
		return "자동차번호 : " +sno +"=> "+color +", " + num+", 자동차 생산 갯수 : " +cnt;
	}
}