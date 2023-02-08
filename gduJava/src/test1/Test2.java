package test1;

import java.util.Scanner;

/*
시스템과 가위(1), 바위(2), 보(3)를 하기
 시스템은 1,2,3 중의 한개의 숫자를 저장하고, 
 한개의 숫자를 입력받아 가위바위보 게임하기 
 
 [결과]
 가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
 1
 사용자 승리!
 가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
 1
 시스템 승리!
*/
public class Test2 {

	public static void main(String[] args) {
		int sys = (int)(Math.random()*3)+1;
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) 를 숫자로 입력하세요 : ");
		int  me = sc.nextInt();
		if(sys>me){
			if(sys==3 && me == 1) {
				System.out.println("사용자 승리!");
			}else {
				System.out.println("시스템 승리!");
			}
		}else if (sys<me) {
			if(sys==1 && me == 3) {
				System.out.println("시스템 승리!");
			}else {
				System.out.println("사용자 승리!");
			}
		}else {
			System.out.println("비겼습니다!");
		}
	}

}
