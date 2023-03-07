package chap13;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class LambdaEx6 {
	public static void main(String[] args) {
		Supplier<String> s1 = () -> "java";
		System.out.println(s1.get());
		IntSupplier s2 = () -> (int)(Math.random()*6)+1;
		System.out.println(s2.getAsInt());
		double[] arr = {1, 1.2, 2.4, 5.3, 10.3};
		DoubleSupplier s3 = () -> {
			double sum = 0;
			for(double d : arr) sum+=d;
			return sum;
		};
		System.out.println(s3.getAsDouble());
	}

}
