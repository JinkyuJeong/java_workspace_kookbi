package chap4;

public class LoopEx1 {
	public static void main(String[] args) {
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.print(5);
		
		System.out.println();
		
		// for문 사용
		int i; 		System.out.println("-for문으로 1~5출력");
		for(i =1; i<=5;i++) {
			System.out.print(i);
		}
		
		System.out.println();
		
		// while문 사용
		i=1; System.out.println("-while문으로 1~5출력");
		while(i<=5) {
			System.out.print(i++);
		}
		
		System.out.println();
		
		// while문 사용
		i=1; System.out.println("-do~while문으로 1~5출력");
		do {
			System.out.print(i++);
		}while(i<=5);
	}

}
