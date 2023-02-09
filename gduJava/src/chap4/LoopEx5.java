package chap4;

public class LoopEx5 {

	public static void main(String[] args) {
		int i, sum=0;
		for(i =1;i<=100;i++) {
			if((i%2 == 0) || (i%3 ==0)) continue;
			sum+=i;
		}
		System.out.println(sum);
	}

}
