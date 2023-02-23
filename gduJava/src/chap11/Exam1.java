package chap11;

public class Exam1 {

	public static void main(String[] args) {
		Card c1 = new Card("Spade", 1);
		Card c2 = new Card("Spade", 1);
		if(c1==c2) System.out.println("c1과 c2는 같은 객체");
		else System.out.println("c1과 c2는 다른 객체");
		if(c1.equals(c2)) System.out.println("c1과 c2는 같은 내용의 객체");
		else System.out.println("c1과 c2는 다른 내용의 객체");
	}

}
class Card {
	String kind;
	int number;
	
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Card) {
			Card c = (Card)obj;
			return this.kind.equals(c.kind) && this.number == c.number;
		}else return false;
	}

	@Override
	public String toString() {
		return String.format("카드의 종류는 %s 카드번호는 %d", kind, number);
	}
	
}