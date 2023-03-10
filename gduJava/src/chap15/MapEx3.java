package chap15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;

public class MapEx3 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
		Function<String, Car> f = s->{
			String[] str = s.split(", +");
			String temp = "";
			try {
				temp= str[4];
			} catch (Exception e) {
				temp = "";
			}
			return new Car(Integer.parseInt(str[0]), Integer.parseInt(str[1]), 
					str[2], Integer.parseInt(str[3]), temp);
		};
		br.lines().map(f).filter(c->c.getCar().equals("K9"))
			.forEach(s->System.out.println(s));
		
	}

}

class Car{
	private int month;
	private int con;
	private String car;
	private int qty;
	private String remark;
	public Car(int month, int con, String car, int qty, String remark) {
		this.month = month;
		this.con = con;
		this.car = car;
		this.qty = qty;
		this.remark = remark;
	}
	public int getMonth() {return month;}
	public int getCon() {return con;}
	public String getCar() {return car;}
	public int getQty() {return qty;}
	public String getRemark() {return remark;}
	@Override
	public String toString() {
		return "[month=" + month + ", con=" + con + ", car=" + car + ", qty=" + qty + ", remark=" + remark + "]";
	}
	
	
}