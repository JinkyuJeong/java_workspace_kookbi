package chap7;

public class OverridingEx1 {

	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		System.out.println(ab.drive());
	}

}
class Bike{
	int wheel;
	public Bike(int wheel) {
		this.wheel = wheel;
	}
	String drive() {
		return "페달을 밟는다";
	}
	String stop() {
		return "브레이크를 잡는다";
	}
}

class AutoBike extends Bike{
	boolean power;
	public AutoBike(int wheel) {
		super(wheel);
	}
	void power() {
		power = !power;
	}
	@Override
	public String drive() {
		return "시동을 건다";
	}
}