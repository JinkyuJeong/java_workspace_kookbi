package chap11;


public class ObjectEx1 {
	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		if(e1==e2) System.out.println("e1과 e2는 같은 객체");
		else System.out.println("e1과 e2는 다른 객체");
		if(e1.equals(e2)) System.out.println("e1과 e2는 같은 내용의 객체");
		else System.out.println("e1과 e2는 다른 내용의 객체");
	}	
}

class Equal {
	int value;
	public Equal(int value) {
		this.value= value;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Equal) {
			Equal e = (Equal)obj;
			return this.value == e.value;
		}else return false;
	}
	
}