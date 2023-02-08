package chap4;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		int score = 100;
		switch(score/10) {
			case 10 :
			case 9: System.out.println("A학점"); break;
			case 8: System.out.println("B학점"); break;
			case 7: System.out.println("C학점"); break;
			case 5: System.out.println("D학점"); break;
			default: System.out.println("F학점");
		}

		switch(score/10) {
			case 10 :
			case 9: 
			case 8:
			case 7: 
			case 6: System.out.println("합격"); break;
			default: System.out.println("불합격");
		}
	}

}
