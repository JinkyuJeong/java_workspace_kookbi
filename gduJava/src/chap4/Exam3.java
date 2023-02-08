package chap4;

public class Exam3 {

	public static void main(String[] args) {
		int rpc = (int)(Math.random()*3)+1;
		
		switch(rpc) {
			case 1 : System.out.println("가위"); break;
			case 2 : System.out.println("바위"); break;
			case 3 : System.out.println("보"); break;
		}
		
	}

}
