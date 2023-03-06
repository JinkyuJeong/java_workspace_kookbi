package chap12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx2 {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		cd.shuffle();
		List<Player> list = new ArrayList<>();
		list.add(new Player("홍길동", cd.pick(0), cd.pick(0)));
		list.add(new Player("김삿갓", cd.pick(0), cd.pick(0)));
		list.add(new Player("이몽룡", cd.pick(0), cd.pick(0)));
		System.out.println(list);
		System.out.println("deck에 남은 카드 갯수 : " + cd.cards.size());
		System.out.println("deck에 남은 카드 : " + cd.cards);
		
		Collections.sort(list,(o1, o2) -> -(o1.getScore() - o2.getScore()));
			
		if(list.get(0).getScore() == list.get(1).getScore()) {
			System.out.println(list.get(0).name + ", " +list.get(1).name + " 비김");
		}else System.out.println(list.get(0).name + " 승리");
	}

}

class EastCard {
	int num;
	boolean isKwang;
	
	public EastCard() {
		this.num=1;
		this.isKwang=true;
	}
	public EastCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	@Override
	public String toString() {
		return this.num + (this.isKwang ? "K" : "");
	}
}

class CardDeck{
	List<EastCard> cards;
	static Map<String,Integer> jokbo;
	
	static {
		jokbo = new HashMap<>();
		jokbo.put("KK", 4000);
		for(int i=1;i<=10;i++) {
			jokbo.put(""+i+i, 3000+(i*10));
		}
		jokbo.put("12", 2060); jokbo.put("21", 2060);
		jokbo.put("14", 2050); jokbo.put("14", 2050);
		jokbo.put("19", 2040); jokbo.put("91", 2040);
		jokbo.put("110", 2030); jokbo.put("101", 2030);
		jokbo.put("410", 2020); jokbo.put("104", 2020);
		jokbo.put("46", 2010); jokbo.put("64", 2010);
	}
	
	public CardDeck() {
		cards = new ArrayList<>();
		for(int i=0; i<20; i++) {
			cards.add(new EastCard(i%10+1 ,(i%10==0 || i%10==2 || i%10==7 ? true : false)));
		}
		System.out.println(cards);
	}
	
	EastCard pick(int idx) { return cards.remove(idx); }
	EastCard pick() { return cards.remove((int)(Math.random()*cards.size())); }
	
	void shuffle() {
		Collections.shuffle(cards);
		System.out.println(cards);
	}
	
}

class Player  {
	String name;
	EastCard c1, c2;
	public Player(String name, EastCard c1, EastCard c2) {
		this.name = name;
		this.c1 = c1;
		this.c2 = c2;
	}
	
	int getScore() {
		if(c1.isKwang && c2.isKwang) return CardDeck.jokbo.get("KK");
		else {
			if(CardDeck.jokbo.get(""+c1.num+c2.num) == null)
				return (c1.num+c2.num)%10;
			else return CardDeck.jokbo.get(""+c1.num+c2.num);
		}
	}

	@Override
	public String toString() {
		return String.format("%s(%s, %s) : %d", this.name, c1, c2, this.getScore());
	}
	
}