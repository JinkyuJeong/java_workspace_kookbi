package exam1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*100)+1;
		int num=0, cnt=0;
		while(true) {
			System.out.print("1부터 100사이의 숫자 입력 : ");
			try {
				num = sc.nextInt();
				if(num>=1 && num<=100) {
					if(num>random) {
						System.out.println(num+ " down");
						cnt++;
					}else if(num<random) {
						System.out.println(num+ " up");
						cnt++;
					}else {
						System.out.println("정답 ["+cnt+"번만에 맞춤]");
						break;
					}
				}else {
					throw new Exception();
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
				sc.nextLine(); cnt++;
			} catch (Exception e) {
				System.out.println("1과 100사이의 숫자만 입력하세요.");
				sc.nextLine(); cnt++;
			}
		}
		
		
	}
}


