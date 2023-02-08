package chap4;

public class LoopEx2 {
	public static void main(String[] args) {
		int i, sum=0;
		for(i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println("(for) 1부터 10까지 더한 값은 " + sum);
		
		i=1;sum=0;
		while(i<=11) {
			sum+=i;
			i++;
		}
		System.out.println("(while) 1부터 10까지 더한 값은 " + sum);
		
		i=1;sum=0;
		do {
			sum+=i;
			i++;
		}while(i<=10);
		System.out.println("(do~while) 1부터 10까지 더한 값은 " + sum);
	}
		
}
