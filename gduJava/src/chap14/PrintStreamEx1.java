package chap14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx1 {

	public static void main(String[] args) throws FileNotFoundException  {
		PrintStream ps = new PrintStream(new FileOutputStream("print.txt"));
		ps.println("홍길동");
		ps.println("1234");
		ps.println(true);
		ps.println(65);
		ps.write(65);
		ps.println('A');
		ps.flush();
		ps.close();
	}

}
