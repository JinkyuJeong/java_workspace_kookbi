package chap8;

public class InterfaceEx4 {

	public static void main(String[] args) {
//		Action a = () -> { System.out.println("Action 인터페이스의 action 메서드"); };
//		a.action();
		Action a = new Action() {
			@Override
			public void action() { System.out.println("Action 인터페이스의 action 메서드"); }
		};
		a.action();
		
		Abs ab = new Abs() {
			@Override
			void method() { System.out.println(num); }
		};
		ab.method();
		
	}
}
interface Action {
	void action();
}
abstract class Abs{
	int num = 100;
	abstract void method();
}