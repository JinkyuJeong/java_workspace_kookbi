package test7;
/*
 * Coin 클래스를 이용하기.
 * 두개의 Coin 객체를 생성하기 myCoin, youCoin 객체 생성하기
 * 앞면이 연속해서 3번 나오면 승리. => myCoin 승리, youCoin 승리, 비김.  
 */
public class Test1 {
	public static void main(String[] args) {
		Coin myCoin = new Coin();
		Coin youCoin = new Coin();
		int myStack=0, youStack=0;
		
		while(true) {
			myCoin.flip();
			youCoin.flip();
			
			if(myCoin.side==0) {
				myStack++; 
				System.out.println("myCoin 앞면 (현재스택 : " + myStack +")");
			}else {
				myStack =0;
				System.out.println("myCoin 뒷면 (현재스택 : " + myStack +")");
			}
			
			if(youCoin.side==0) {
				youStack++; 
				System.out.println("youCoin 앞면 (현재스택 : " + youStack + ")"); 
			}else {
				youStack =0;
				System.out.println("youCoin 뒷면 (현재스택 : " + youStack + ")"); 
			}
			
			try {Thread.sleep(2000);} catch (Exception e) {}	// 2초 딜레이 (확인용) 안써도됨
			
			if(myStack ==3 || youStack ==3) break;
			
			System.out.println("=== 2초 후 다시 동전을 던집니다 ===");
		}
		
		if(myStack==3 && youStack==3 ) {System.out.println("\n까비 ~ 비김"); return;}
		if(myStack==3) System.out.println("\n축축축축!! myCoin 승리");
		if(youStack==3) System.out.println("\n축축축축!! youCoin 승리");
	}

}

class Coin {
	int side;
	void flip() {
		side = (int)(Math.random()*2);
	}
}