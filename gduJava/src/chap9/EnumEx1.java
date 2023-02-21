package chap9;

public class EnumEx1 {
	public enum Car{ 
		AVANTE("아반떼"), SONATA("소나타"), GRANDEUR("그랜저"), SM5("SM5");
		private final String nick;
		Car(String name) {
			this.nick =name;
		}
	}
	public static void main(String[] args) {
		Car car = Car.AVANTE;
		System.out.println(car.name());
		System.out.println(car.nick);
		Car[] cars = Car.values();
		for(Car c : cars)
			System.out.println(c + " : "+ c.ordinal());
		if(car instanceof Object) {
			System.out.println("car객체는 Object 객체다.");
		}
	}

}
