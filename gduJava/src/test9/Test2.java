package test9;
//다음 소스는 컴파일 오류가 발생한다. 결과가 "Tested" 가 출력되도록 프로그램을 수정하기
interface Beta {
	String testIt();
}

class Alpha implements Beta {
	public String testIt() {
		return "Tested";
	}
}
class Gamma implements Beta {
	public String testIt() {
		return "Tested";
	}
	String testIt2() {
		return "Gamma";
	}
}
public class Test2 {
	static Beta getIt() {
		return new Alpha();
	}
	public static void main(String[] args) {
		Beta b = getIt();
		System.out.println(b.testIt());
	}

}
