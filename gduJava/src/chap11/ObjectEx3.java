package chap11;

// hashcode : JVM이 객체를 구별하기위한 고유ID값
// 객체의 논리적 동등성을 위해 오버라이딩 필요함 (equals와 같이)

public class ObjectEx3 {
	public static void main(String[] args) {
//		String s1 = new String("abc");
//		String s2 = new String("abc");
		String s1 = "abc";
		String s2 = "abc";
	
		if(s1==s2)
			System.out.println("s1과 s2는 같은 객체임");
		else
			System.out.println("s1과 s2는 다른 객체임");
		System.out.println("s1.hashcode() : "+ s1.hashCode());
		System.out.println("s2.hashcode() : "+ s2.hashCode());
		System.out.println("s1의 원래 hashcode값 : "+ System.identityHashCode(s1));
		System.out.println("s2의 원래 hashcode값 : "+ System.identityHashCode(s2));
	}

}
