package chap6;

public class CarEx1 {
	public static void main(String[] args) {
		System.out.println("자동차의 크기 : "+ Car.height+", "+Car.width);
		Car car1 = new Car();
		car1.color ="white";
		car1.num = 1234;
		System.out.println(car1);
		Car car2 = new Car();
		car2.color ="black";
		car2.num = 3456;
		System.out.println(car2);
		car1.width = 300;
		car1.height = 150;
		System.out.println(car1);
		System.out.println(car2);
	}

}

class Car {
	String color;
	int num;
	static int width = 200;
	static int height = 120;
	
	@Override
	public String toString() {
		return color +" : " + num + "(" +width +", " + height + ")";
	}
}