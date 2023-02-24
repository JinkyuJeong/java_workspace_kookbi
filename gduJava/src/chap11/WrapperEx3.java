package chap11;

/*
 * switch 구문에서 조건값으로 사용할 수 있는 자료형
 * 		: byte, short, int, char, String
 * 		 Byte, Short, Integer, Character 
 * */
public class WrapperEx3 {
	public static void main(String[] args) {
		Integer data = 0;
		switch(data) {
			default : System.out.println("switch 테스트");
		}
	}
}
