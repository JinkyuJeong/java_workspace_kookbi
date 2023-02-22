package exam1;

public class Test5 {

	public static void main(String[] args) {
		String[][] x = new String[11][11];
		for(int i=0 ; i<11;i++) {
			for(int j=0;j<11;j++) {
				if(i==j) x[i][j]="X";
				else if(i+j==10) x[i][j]="X";
				else x[i][j]="  ";
			}
		}


		for(int i=0 ; i<11;i++) {
			for(int j=0;j<11;j++) {
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
	}

}
