package chap11;

public class StringEx4 {
	public static void main(String[] args) throws InterruptedException {
		String sf = String.format("%.2f", 0.142);
		System.out.println(sf);
		sf = String.format("%.2f", 0.145);
		System.out.printf("%010.2f\n", 0.145);
		System.out.println(sf);
		sf = String.format("%,d", 12345);
		System.out.println(sf);
		System.out.printf("%10d\n", 12345);
		System.out.printf("%-10d\n", 12345);
		System.out.printf("%010d\n", 12345);
		System.out.printf("%,10d\n", 12345);
		System.out.printf("%-,10d\n", 12345);
		System.out.printf("%-,4d\n", 12345);	// 최소 4자리 확보
		System.out.printf("%X, %x\n", 255, 255);	
		System.out.printf("%02X, %02x\n", 10, 10);	
		System.out.printf("%o\n", 10);	
		System.err.printf("%s\n", "홍길동");	
		System.err.printf("%10s\n", "홍길동");	
		System.err.printf("%-10s\n", "홍길동");	
		System.err.printf("%-10s\n", "홍길동");	
		System.err.printf("%c%c%c\n", '홍', '길', '동');
		System.err.printf("%s의 학점은 %c입니다. 점수는 %3d입니다. \n", "홍길동", 'A', 95);
		
		
	}
}
