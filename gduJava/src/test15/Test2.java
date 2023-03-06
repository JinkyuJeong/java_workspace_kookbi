package test15;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * EastCard, CardDeck, Player를 이용하여 다음 구동 클래스를 완성하시오
 [결과]
[1K, 2, 3K, 4, 5, 6, 7, 8K, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[6, 7, 5, 4, 5, 8, 9, 10, 2, 3, 10, 4, 1K, 6, 1, 7, 2, 3K, 9, 8K]
게임할 인원수를 입력하세요(최대:10)
5
1등:2번(5,4):9
1등:4번(9,10):9
3등:5번(2,3):5
4등:1번(6,7):3
4등:3번(5,8):3
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Player, Integer> map = new TreeMap<>((p1,p2) -> p2.getScore() >= p1.getScore()? 1: -1 );
		CardDeck deck = new CardDeck();
		deck.shuffle();
		System.out.println("게임 할 인원수를 입력하세요(최대:10)");
		int h = sc.nextInt();
		for(int i=1; i<=h ; i++) {
			Player p = new Player(i+"번", deck.pick(0), deck.pick(0));
			map.put(p, p.getScore());
		}
		System.out.println(map);
		int idx=0, cnt=1;
		Set<Player> set = map.keySet();
		for(Player p1 : set) {
			for(Player p2: set) {
				if(p1.getScore()<p2.getScore()) cnt++;
			}
			System.out.println(cnt+"등 : " + p1);
			cnt=1;
		}
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