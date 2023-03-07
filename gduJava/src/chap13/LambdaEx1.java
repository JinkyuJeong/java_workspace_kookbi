package chap13;

public class LambdaEx1 {
	public static void main(String[] args) {
		LambdaInterface1 l1 = new LambdaInterface1() {
			@Override
			public void method() {
				System.out.println("기존 방식으로 코딩");
			}
		};
		l1.method();
		l1 = () -> {
			String str = "1. 람다방식으로 코딩";
			System.out.println(str);
		};
		l1.method();
		l1 = () -> System.out.println("2. 람다방식으로 코딩");
		l1.method();
		execute(() -> System.out.println("3. 함수의 매개변수로 람다객체 실행"));
		execute(() -> System.out.println("4. Hello World!"));
		execute( () -> {
			int sum=0;
			for(int i=1;i<=100;i++) {
				sum+=i;
			}
			System.out.println("5. 1부터 100까지의 합은 : " + sum);
		});
		
	}
	static void execute (LambdaInterface1 l) {
		l.method();
	}
}

@FunctionalInterface
interface LambdaInterface1{
	void method();
}
