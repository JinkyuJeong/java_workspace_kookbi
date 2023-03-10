package test17;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

/*
 * 1~100 사이의 임의의 수 10개를 저장한 배열을 이용하여
 * IntBinaryOperator 인터페이스와 IntPredicate 인터페이스를 이용하여
 * 배열에 저장된 짝수,홀수별 최대 숫자와 최소 숫자를 출력하기
 */
public class Test1 {
	private static int[] arr = new int[10];
	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++) {
			arr[i]= (int)(Math.random()*100)+1;
			System.out.print(arr[i]+",");
		}
		System.out.println();
		System.out.println("홀수 최대값:"	+maxOrMin((i1,i2)-> i1>=i2?i1:i2, i->i%2==1));
		System.out.println("짝수 최대값:"	+maxOrMin((i1,i2)->i1>=i2?i1:i2, i->i%2==0));
		System.out.println("홀수 최소값:"	+maxOrMin((i1,i2)->i1<=i2?i1:i2, i->i%2==1));
		System.out.println("짝수 최소값:"	+maxOrMin((i1,i2)->i1<=i2?i1:i2, i->i%2==0));
		System.out.println("최대값:"		+maxOrMin((i1,i2)->i1>=i2?i1:i2, i->true));
		System.out.println("최소값:"		+maxOrMin((i1,i2)->i1<=i2?i1:i2, i->true));
	}

	private static int maxOrMin(IntBinaryOperator op, IntPredicate p) {
		int result = 0;
		boolean first = true;

		for(int n : arr) {
			if(p.test(n)) {
				if(first) {
					first=false;
					result=n;
				}
				result = op.applyAsInt(result,n);
			}
		}

		return result;
	}

}