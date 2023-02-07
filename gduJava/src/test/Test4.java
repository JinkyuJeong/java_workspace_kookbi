package test;
import java.util.Scanner;

/*
 *  화면에서 두수를 입력받아서 더큰수를 출력하기 
 */
public class Test4 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1+"과 "+num2+" 중 더 큰수는 "  + (num1>num2 ? num1 : num2));
	}
}
