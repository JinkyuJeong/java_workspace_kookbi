package chap4;

public class Exam7 {

	public static void main(String[] args) {
		for(int i=2;i<=9;i++){
			System.out.print(i+"단\t\t");
		}
		
		for(int i =2; i<=9;i++) {
			for(int j=2; j<=9; j++)
				System.out.printf("%d * %d = %d\t", j, i, i*j);
			System.out.println();
		}
	}

}
