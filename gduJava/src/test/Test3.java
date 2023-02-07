package test;
import java.util.Scanner;

/*
 * 화면에서 점수를 입력받아서 
 * 90점 이상이면 A학점,80점 이상이면 B학점
 * 70점 이상이면 C학점,60점 이상이면 D학점
 * 60 점 미만이면 F학점을 출력하기
 */
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		char grade = score>=90 ? 'A' : score>=80 ? 'B' : score>=70 ? 'C' : score>=600 ? 'D' : 'F';
		System.out.println("당신의 학점은 " + grade +"학점");
	}

}
