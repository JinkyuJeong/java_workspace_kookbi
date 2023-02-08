package test1;
import java.util.Scanner;
/*
1.  화면에서 한개의 문자를 입력받아
     대문자인 경우는 소문자로, 
     소문자인 경우는 대문자로 
     숫자인 경우는 20을 더한 값을   출력하기
     그외의 문자는 기타 문자 를 출력하세요 
*/
public class Test1 {

	public static void main(String[] args) {
		System.out.print("문자를 입력 : ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if (ch >= 'a' && ch <= 'z')
			ch -= 32;
		else if (ch >= 'A' && ch <= 'Z')
			ch += 32;
		else {
			System.out.println("기타문자"); return;
		}
	
		System.out.println("결과 : "+ch);
	}		

}
