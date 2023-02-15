package chap6;

public class Exam4 {
	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3, false);
		SutdaCard c2 = new SutdaCard();
		System.out.println(c1);
		System.out.println(c2);
	}

}
class SutdaCard{
	int num;
	boolean isKwang;
	public SutdaCard() {
		this.num = 1;
		this.isKwang = true;
	}
	public SutdaCard(int  n, boolean b) {
		this.num = n;
		this.isKwang = b;
	}
	@Override
	public String toString() {
		return this.num+(this.isKwang==true ? "K" : "");
	}
}