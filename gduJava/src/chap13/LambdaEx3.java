package chap13;

public class LambdaEx3 {

	public static void main(String[] args) {
		LamdaInterface3<Integer, Integer, Integer> l3 = (x,y) -> x*y;
		System.out.println("두 수의 곱 : " + l3.method(2, 5));
		l3 = (x,y) -> x+y;
		System.out.println("두 수의 합 : " + l3.method(2, 5));
		l3 = (x,y) -> x>y?x:y;
		System.out.println("두 수 중 큰 수: " + l3.method(2, 5));
		l3 = (x,y) -> x>y?y:x;
		System.out.println("두 수 중 작은 수: " + l3.method(2, 5));
		l3 = (x,y) -> (int)sum(x,y);
		System.out.println("두 수의 합 : " + l3.method(2, 5));
	}

	private static Object sum(Integer x, Integer y) {
		return x+y;
	}

}

interface LamdaInterface3<T1, T2, R> {
	 R method(T1 t1, T2 t2);
}
