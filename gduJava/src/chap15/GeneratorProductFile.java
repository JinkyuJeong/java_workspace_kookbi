package chap15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class GeneratorProductFile {

	public static void main(String[] args) throws IOException {
		PrintStream ps = new PrintStream(new FileOutputStream("product.txt"));
		String[] cars = {"아반테", "그랜저", "SM7", "BMW", "벤츠", "K9"};
		String[] remarks = {"몰라요", "싫어요", "그냥그래요", "좋아요"};
		int limit=0, con=0;
		while(limit++<1000) {
			ps.print((int)(Math.random()*12)+1+", ");
			con=(int)(Math.random()*3)+1;
			ps.print(con + ", ");
			ps.print(cars[(int)(Math.random()*cars.length)]+", ");
			ps.print((int)(Math.random()*5)+1);
			if(con==3) {
				ps.print(", ");
				ps.print(remarks[(int)(Math.random()*3)]);
			}
			ps.println();
		}
		ps.flush(); ps.close();
	}

}
