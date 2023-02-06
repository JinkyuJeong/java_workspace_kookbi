package chap2;
public class VarEx2 {
	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);			// A
		char ch2 = (char)66;
		System.out.println(ch2);			// B
		System.out.println(-'A'+'B');	// 1
		
		char single = '\'';
		System.out.println(single);		// 작은따옴표 출력
		System.out.println("서울\t대전\t대구\t부산");		// \t : 탭
		System.out.println("안녕하세요.\n이 부분은 다음줄에 출력됩니다.");		// \n : 개행문자
		System.out.println("\uD64D\uAE38\uB3D9");		// 유니코드
		System.out.println("c:\\test");	// 역슬래시 출력
		
		// int true = 100; 예약어라서 불가능
		int True = 100;		
		char $input = '#';		// 가능
		// int 7up = 7; 숫자로 시작 불가능 
	}

}
