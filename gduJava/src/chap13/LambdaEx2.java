package chap13;

public class LambdaEx2 {
	public static void main(String[] args) {
		LambdaInterface2<Integer> l2 = i -> System.out.println(i*5); 
		l2.method(10);
		l2.method(2);
		calc(n -> {
			long sum=0;
			for(int i=0; i<=n; i++) sum+=i;
			System.out.printf("1부터 %d까지의 합은 %d\n", n, sum);
		}, 100);
		
		calc(n -> {
			long sum=0;
			for(int i=0; i<=n; i+=2) sum+=i;
			System.out.printf("1부터 %d까지 짝수의 합은 %d\n", n, sum);
		}, 100);
	}
	private static void calc(LambdaInterface2<Integer> l, int i) {
		l.method(i);
	}
}

@FunctionalInterface
interface LambdaInterface2<T>{
	void method(T t);
}