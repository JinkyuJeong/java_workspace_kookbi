package chap8;

public class Exam1 {

	public static void main(String[] args) {
		Animal a = new Dove();
		a.eat();
		if(a instanceof Flyable) {
			Flyable f = (Flyable)a;
			f.fly();
		}
		a = new Monkey();
		a.eat();
		if(a instanceof Flyable) {
			Flyable f = (Flyable)a;
			f.fly();
		}
	}

}

abstract class Animal {
	String name;
	public Animal(String name) {
		this.name =name;
	}
	abstract void eat();
}

interface Flyable {
	void fly();
}

class Dove extends Animal implements Flyable{
	public Dove() {
		super("비둘기");
	}
	@Override
	public void eat() {
		System.out.println(this.name+"가 날아다니며 작은 벌레를 먹는다.");
	}
	@Override
	public void fly() {
		System.out.println(this.name+"가 날아다닌다.");
	}
}

class Monkey extends Animal{
	public Monkey() {
		super("원숭이");
	}
	public void eat() {
		System.out.println(name+"가 나무 위에서 밥을 먹는다.");
	}
}