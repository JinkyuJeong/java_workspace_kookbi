package test7;
/*
1. Food 클래스
멤버 변수 : 가격(price)과 포인트(point)
생성자 : 식품의 객체 생성시 가격을 입력받아야 하고, 가격의 10%를 포인트로 저장한다.
식품의 종류는 과일(Fruit),음료(Drink),과자(Snack)로 나눠 진다.
Fruit 클래스 : Food 클래스의 하위 클래스
Drink 클래스 : Food 클래스의 하위 클래스
Snack 클래스 : Food 클래스의 하위 클래스
과일 클래스는 당도(brix)를, 음료는 용량(ml), 과자는 무게(gram)을 멤버로 가진다
과일의 종류로는 사과(Apple),복숭아(Peach),
음료의 종류로는 콜라(Cock) 와 사이다(Sidar)
과자의 종류로는 비스킷(Biscuit)과 쿠키(Cookie) 가 있다.
사과,복숭아, 콜라, 사이다,비스킷,쿠키 클래스에 toString() 메서드를 구현하고
각각의 이름을 리턴한다.
 */
public class Test3 {

	public static void main(String[] args) {
		Apple apple = new Apple(1000,10.5);//가격, 당도(brix)
		System.out.println("사과 가격:" + apple.price);
		System.out.println("사과 당도:" + apple.brix);
		Peach peach = new Peach(1000,13.5);//가격, 당도(brix)
		Cock cock = new Cock(500,500);   //가격, 용량(ml)
		Sidar sidar = new Sidar(1500,1000);//가격, 용량(ml)
		Biscuit bis = new Biscuit(10000,500);//가격, 무게(gram)
		Cookie cookie = new Cookie(500,5000);//가격, 무게(gram)

	}
}

class Food {
	int price;
	int point;
	
	public Food(int price) {
		this.price = price;
		this.point = price/10;
	}
}

class Fruit extends Food{
	double brix;
	public Fruit(int price, double brix) {
		super(price);
		this.brix = brix;
	}
}
class Apple extends Fruit {
	public Apple(int price, double brix) {
		super(price, brix);
	}
	@Override
	public String toString() {
		return "Apple";
	}
}
class Peach extends Fruit {
	public Peach(int price, double brix) {
		super(price, brix);
	}
	@Override
	public String toString() {
		return "Peach";
	}
}

class Drink extends Food{
	int ml;
	public Drink(int price, int ml) {
		super(price);
		this.ml = ml;
	}
}
class Cock extends Drink{
	public Cock(int price, int ml) {
		super(price, ml);
	}
	@Override
	public String toString() {
		return "Cock";
	}
}
class Sidar extends Drink{
	public Sidar(int price, int ml) {
		super(price, ml);
	}
	@Override
	public String toString() {
		return "Sidar";
	}
}

class Snack extends Food{
	int gram;
	public Snack(int price, int gram) {
		super(price);
		this.gram = gram;
	}
}
class Biscuit extends Snack {
	public Biscuit(int price, int gram) {
		super(price, gram);
	}
	@Override
	public String toString() {
		return "Biscuit";
	}
}
class Cookie extends Snack {
	public Cookie(int price, int gram) {
		super(price, gram);
	}
	@Override
	public String toString() {
		return "Cookie";
	}
}
