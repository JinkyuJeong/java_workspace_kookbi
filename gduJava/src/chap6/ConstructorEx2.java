package chap6;

public class ConstructorEx2 {

	public static void main(String[] args) {
		Car3 c1 = new Car3("Blue", 1234);
		Car3 c2 = new Car3("Red");
		Car3 c3 = new Car3(2345);
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		System.out.println("c3:"+c3);
	}

}

class Car3{
	String color;
	int number;
	static int width = 200;
	static int height = 200;
	
	public Car3(String c, int n) {
		this(c); this.number = n;
	}
	public Car3(String c) {
		this.color = c;
		this.number = 1234;
	}
	public Car3(int n) {
		this.color = "White";
		this.number = n;
	}
	
	@Override
	public String toString() {
		return color + "," +number + "(" +width+","+height+")";
	}
	
}