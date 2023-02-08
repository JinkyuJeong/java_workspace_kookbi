package chap4;

public class SwitchEx2 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*10) +1;
		switch(num) {
			case 1: System.out.println("축하합니다. 자전거 당첨입니다.");	break;
			case 2: System.out.println("축하합니다. USB 당첨입니다.");	break;
			case 3: System.out.println("축하합니다. 키보드 당첨입니다.");	break;
			default: System.out.println("다음기회에...");	break;
		}
	}

}
