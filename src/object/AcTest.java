package object;

public class AcTest {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("전사임");
		w1.level =1;
		w1.id ="전사1임";
		w1.hp = 20;
		w1.atk = 3;
		w1.getStatus();
		w1.huntMonster();
		w1.getStatus();
		Magician m1 = new Magician("마법사임");
		m1.huntMoster();
		m1.getStatus();
		m1.meditation();
		m1.getStatus();
	}

	
	
}
