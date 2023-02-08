package chap4;

public class Exam4 {
	public static void main(String args[]) {
		int i,sum=0;
		for(i=1;i<=100;i++) {
			if(i%2==0)
				sum+=i;
		}
//		for(i=0;i<=100;i+=2) {
//			sum+=i;
//		}
		System.out.println("(for) 1~100까지 짝수의 합은 "+sum);
		
		i=1; sum=0;
		while(i<=100) {
			if(i%2==0) 
				sum+=i;
			i++;
		}
		System.out.println("(while) 1~100까지 짝수의 합은 "+sum);
		
		i=2; sum=0;
		do {
			sum+=i;
			i+=2;
		}while(i<=100);
		System.out.println("(do~while) 1~100까지 짝수의 합은 "+sum);
		
	}
}
