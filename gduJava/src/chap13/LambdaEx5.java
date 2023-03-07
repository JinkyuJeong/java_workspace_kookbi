package chap13;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class LambdaEx5 {
	public static void main(String[] args) {
		Consumer<String> c1 = t1 -> System.out.println(t1+8);
		c1.accept("Java");
		BiConsumer<String,String> c2 = (t1,t2) -> System.out.println(t1+t2);
		c2.accept("java", "8.0");
		IntConsumer c3 = i -> System.out.println(i*100);
		c3.accept(10);
		c3 = n->{
			long sum=0;
			for(int i=0; i<=n; i++) sum+=i;
			System.out.printf("1부터 %d까지 합은 %d\n", n, sum);
		};
		c3.accept(100);
	}

}
