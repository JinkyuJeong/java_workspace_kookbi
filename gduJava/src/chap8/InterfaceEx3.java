package chap8;

public class InterfaceEx3 {

	public static void main(String[] args) {
		Tank t = new Tank();
		Dropship d = new Dropship();
		Marine m = new Marine();
		Scv s = new Scv();
		s.repair(t);
		s.repair(d);
//		s.repair(m);
		s.repair(s);
	}

}

class Unit{
	int hp;
	final int MAX;
	public Unit(int hp) {
		// TODO Auto-generated constructor stub
		this.hp =hp;
		this.MAX = hp;
	}
}

interface Repairable{}

class AirUnit extends Unit{
	public AirUnit(int hp) { super(hp); }
}
class GroundUnit extends Unit{
	public GroundUnit(int hp) { super(hp); }
}
class Dropship extends AirUnit implements Repairable{
	public Dropship() { super(125); }
	@Override
	public String toString() { return "Dropship"; }
}
class Tank extends GroundUnit implements Repairable{
	public Tank() { super(150); }
	@Override
	public String toString() { return "Tank"; }
}
class Marine extends GroundUnit{
	public Marine() { super(40); }
	@Override
	public String toString() { return "Marine"; }
}
class Scv extends GroundUnit implements Repairable{
	public Scv() { super(60); }
	@Override
	public String toString() { return "Scv"; }
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			u.hp = u.MAX;
			System.out.println(r+ " 수리 완료");
		}
	}
}

