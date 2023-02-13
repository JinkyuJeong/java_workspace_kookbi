package chap5;

public class Exam4 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0; i<args.length;i++) {
			int num = Integer.parseInt(args[i]);
			System.out.print("입력값 : " + num+", ");
			while(num!=0) {
				sum +=num%10;
				num /=10;
			}
			System.out.println("args["+i+"] "+"자릿수 합한 값 : " +sum);
			sum=0;
		}
	}

}
