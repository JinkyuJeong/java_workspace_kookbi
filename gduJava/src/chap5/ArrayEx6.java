package chap5;

public class ArrayEx6 {

	public static void main(String[] args) {
		if(args.length == 0 ) {
			System.out.println("command 라인에 파라미터를 입력하세요");
			return;
		}
		
		for(String a : args)
			System.out.println(a);
	}

}
