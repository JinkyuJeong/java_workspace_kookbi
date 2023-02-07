package test;
import java.util.Scanner;

//반지름을 입력받아 원의 둘레와 면적을 구하시오
public class Test6 {

	public static void main(String[] args) {
		double pi = 3.141592;
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");
		int r = sc.nextInt();
		System.out.println("원의 둘레 : " + 2*pi*r);
		System.out.println("원의 넓이 : " + 2*pi*r*r);
	}

}
