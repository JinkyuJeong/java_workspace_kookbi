package chap4;

public class LoopEx3 {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			System.out.println(i+"단");
			for(int j=2;j<=9;j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}
		
		for(int i =2 ; i<=9; i++) {
			for(int j=1; j<=9;j++) {
				System.out.printf("%d * %d = %d\t ", i, j, i*j);
			}
			System.out.println();
		}
	}

}
