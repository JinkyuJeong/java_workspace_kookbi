package chap4;

public class Exam10 {
	public static void main(String[] args) {
		int i, sum=0;
		for(i=0;i<=100;i++) {
			sum +=i;
			if(sum>1000) break;
		}
		System.out.println(i+" "+sum);
	}

}
