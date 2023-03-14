package chap17;

public class ThreadEx4 {

	public static void main(String[] args) throws InterruptedException {
		PrintThread1 t1 = new PrintThread1('A');
		PrintThread1 t2 = new PrintThread1('B');
		PrintThread1 t3 = new PrintThread1('C');
		t1.start();
		t2.start();
		t3.start();
	}

}


class PrintThread1 extends Thread{
	char ch;
	Double lock = 1.0;
	public PrintThread1(char ch) {
		this.ch = ch;
	}

	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			synchronized (lock) {
				for(int j=0;j<80;j++) {
					System.out.print(ch);
				}
				System.out.println();
			}
		}
	}
}