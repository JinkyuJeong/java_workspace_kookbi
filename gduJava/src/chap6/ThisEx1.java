package chap6;


public class ThisEx1 {

	public static void main(String[] args) {
		Car4 c1 = new Car4("blue", 1234);
		Car4 c2= new Car4();
		Car4 c3= new Car4("red");
		Car4 c4= new Car4(1234);
		Car4 c5= new Car4(c1);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
	}
}

class Car4{
	String color;
	int number;
	int serialNo;
	static int sno;
	public Car4(String color, int number) {
		System.out.println("Car4(Sting, int) 생성자");
		this.color =color;
		this.number = number;
		serialNo=++sno;
	}
	public Car4() {
		this("white", 1111);
		System.out.println("Car4() 생성자");
	}
	public Car4(String color) {
		this(color, 1111);
		System.out.println("Car4(String) 생성자");
	}
	public Car4(int number) {
		this("white", number);
		System.out.println("Car4(int) 생성자");
	}
	public Car4(Car4 c) {
		this(c.color,c.number);
	}
	
	@Override
	public String toString(){
		return serialNo + "번 자동차:"+this.color +", "+this.number;
	}
}