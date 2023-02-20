package chap8;

public class InterfaceEx2 {

	public static void main(String[] args) {
		PrinterManager.getPrint("INK").print();
		PrinterManager.getPrint("LAZER").print();
	}

}

class Lazerzet implements Printerable{
	@Override
	public void print() {
		System.out.println("레이저젯 프린터로 프린트");
	}
	
}
class Inkzet implements Printerable{
	@Override
	public void print() {
		System.out.println("잉크젯 프린터로 프린트");
	}
	
}

class PrinterManager{
	public static Printerable getPrint(String type) {
		if(type.equals("INK")) return new Inkzet();
		else return new Lazerzet();
	}
}
