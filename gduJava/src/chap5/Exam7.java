package chap5;

public class Exam7 {

	public static void main(String[] args) {
		int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}
		};
		int[][] result = new int[score.length+1][score[0].length+1];
		int[] hSum = new int[3];
		String[] s = {"국어","영어","수학"};
		
		for(int i=0;i <score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				result[i][j]= score[i][j];
				result[i][score[i].length] +=score[i][j];
				result[score.length][j] +=score[i][j];
				result[score.length][score[i].length] +=score[i][j];
				if(i<3)
					hSum[i] += result[i][i];
			}
		}
		System.out.print("\t국어\t영어\t수학\t총점\t평균\n");
		for(int i=0; i<result.length;i++) {
			System.out.print(i+"번학생 : ");
			for(int j=0; j<result[i].length;j++) {
				System.out.printf("%-8d",result[i][j]);
			}
			System.out.printf("%.1f",(float)result[i][score[0].length]/3);
			System.out.println();
		}
		
		for(int i=0;i<hSum.length;i++) {
			System.out.print(s[i]+"평균 : ");
			System.out.printf("%.1f\n",(float)hSum[i]/3);
		}
	}

}
