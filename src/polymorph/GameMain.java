package polymorph;

public class GameMain {

	public static void main(String[] args) {
		Warrior wa = new Warrior(20, 5, 10);
		
		Orc orc1 = new Orc();
		Orc orc2 = new Orc();
		Dragon d1 = new Dragon();
		
		wa.hunt(orc1);
		wa.hunt(orc1);
		
		wa.hunt(d1);
		
		wa.showHp();
		
		orc1.showHp();
		orc2.showHp();
		d1.showHp();
	}

}
