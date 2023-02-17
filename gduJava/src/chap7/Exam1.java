package chap7;

class Buyer {
	int money=500;
	int point;
	Product[] items = new Product[5];
	int cnt;
	
	public void buy(Product p) {
		this.money -= p.price;
		this.point += p.point;
		this.items[cnt++] = p;
		System.out.println(p+" 구입");
	}
	public void summary() {
		int sumPrice=0;
		int sumPoint=0;
		String totalName="";
		for(Product p : this.items) {
			if(p !=null) {
				sumPrice+=p.price;
				sumPoint+=p.point;
				totalName+=p+", ";
			}
		}
		System.out.println("구매전체 합계 :" + sumPrice +", 포인트 합계 :"+sumPoint+", 잔액 :"+this.money+
									", 전체구매 물품 이름 :"+totalName);
	}
}

public class Exam1 {

	public static void main(String[] args) {
		Tv t = new Tv();
		Computer c = new Computer();
		HandPhone h = new HandPhone();
//		System.out.println(t + "=>"+t.price +"만원, 포인트:"+t.point);
//		System.out.println(c + "=>"+c.price +"만원, 포인트:"+c.point);
//		System.out.println(h + "=>"+h.price +"만원, 포인트:"+h.point);
		
		Product[] p = new Product[3];
		p[0] = t;
		p[1] = c;
		p[2] = h;
		int sumPrice =0;
		int sumPoint =0;
		for(int i=0; i<p.length;i++) {
			sumPrice += p[i].price;
			sumPoint += p[i].point;
		}
		
//		System.out.println("전체 제품가격 : "+ sumPrice);
//		System.out.println("전체 제품포인트 : "+ sumPoint);
		
		Buyer b = new Buyer();
		b.buy(t);
		b.buy(c);
		b.buy(h);
		b.summary();
	}

}

class Product {
	int price;
	int point;
	
	public Product(int price) {
		this.price = price;
		this.point = price/10;
	}
}

class Tv extends Product{
	public Tv() {
		super(100);
	}
	@Override
	public String toString() {
		return "TV";
	}
}

class Computer extends Product{
	public Computer() {
		super(200);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}

class HandPhone extends Product{
	public HandPhone() {
		super(150);
	}
	@Override
	public String toString() {
		return "HandPhone";
	}
}