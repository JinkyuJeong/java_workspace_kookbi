package chap11;

import java.util.Random;

public class Exam5 {

	public static void main(String[] args) throws InterruptedException {
		Random game = new Random();
		game.setSeed(System.currentTimeMillis());
		
		boolean sys,user;
		int sysCnt=0, userCnt=0;
		while(true) {
			sys = game.nextBoolean();
			user = game.nextBoolean();
			
			if(sys) sysCnt++;
			else sysCnt=0;
			if(user) userCnt++;
			else userCnt=0;
			System.out.println("시스템" + sys+"\t\t사용자 "+user);
			
			if(sysCnt == 3 || userCnt ==3) break;
		}
		
		if(sysCnt == 3 && userCnt ==3) System.out.println("비김");
		else if(sysCnt==3) System.out.println("시스템승리");
		else System.out.println("사용자승리");
		
	}
}
