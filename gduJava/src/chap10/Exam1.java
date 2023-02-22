package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1~10 사이의 숫자를 입력하세요 : ");
			try {
				int  num = sc.nextInt();
				if(num>=1 && num<=10) {
					System.out.print(num + " : ");
					for(int i=0 ;i<num;i++) {
						System.out.print("*");
					}
				}else {
					throw new Exception("입력된 숫자는 1~10사이만 가능합니다.");
				}
				System.out.println();
				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요.");
				sc.nextLine();
			}catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				sc.nextLine();
			}
		}
		
	}
}
