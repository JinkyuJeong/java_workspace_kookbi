package test1;
/*
 * 1부터 100까지의 숫자 중 2의 배수이거나, 3의 배수의 합을 구하기 
 */
public class Test6 {

	public static void main(String[] args) {
		int i, sum=0;
		for(i=1;i<=100;i++) {
			if(i%2==0 || i%3==0)
				sum+=i;
		}
		System.out.println("1~100 중 2의 배수이거나 3의배수의 합은 " + sum);
	}

}
