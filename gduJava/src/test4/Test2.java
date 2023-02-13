package test4;
/*
Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기
    int num = Integer.parseInt(args[0]);
  [결과]
  10의 약수 : 1,2,5,10,
*/
public class Test2 {

	public static void main(String[] args) {
		if(args.length == 0 ) {
			System.out.println("command 라인에 파라미터를 입력하세요");
			return;
		}
		int num = Integer.parseInt(args[0]); 
		int i=1;
		
		while(i != num+1) {
			if(num%i==0)
				System.out.print(i+ ",");
			i++;
		}
	}

}
