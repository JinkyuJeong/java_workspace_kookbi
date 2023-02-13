package test4;
/*
command line에서 숫자로 이루어진 문자를 두개 받아서 두수의 공약수를 구하시오
int num1 = Integer.parseInt(args[0])
   [결과]
   10과 20 의 공약수 : 1,2,5,10,
 */
public class Test3 {

	public static void main(String[] args) {
		if(args.length == 0 ) {
			System.out.println("command 라인에 파라미터를 입력하세요");
			return;
		}
		int num1 = Integer.parseInt(args[0]); 
		int num2 = Integer.parseInt(args[1]); 
		int i=1;
		
		while(i != num1+1 && i !=num2+1) {
			if(num1%i==0 & num2%i==0)
				System.out.print(i+", ");
			i++;
		}
	}

}
