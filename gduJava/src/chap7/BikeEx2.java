package chap7;

public class BikeEx2 {

	public static void main(String[] args) {
		AutoBike2 ab = new AutoBike2(2);
		Bike2 b = null;
		ab.power();
		ab.drive();
		System.out.println("ab.wheel="+ab.wheel);
		ab.stop();
		b = ab;
		b.drive();
		Object o = b;
	}

}

class Bike2{
	int wheel;
	public Bike2(int wheel) {
		this.wheel = wheel;
	}
	void drive() {
		System.out.println("페달을 밟는다");
	}
	void stop() {
		System.out.println("브레이크를 잡는다");
	}
}

class AutoBike2 extends Bike2{
	boolean power;
	public AutoBike2(int wheel) {
		super(wheel);
	}
	void power() {
		power = !power;
	}
}