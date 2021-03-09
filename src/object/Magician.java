package object;

public class Magician {
	public int level;
	public int mp;
	public int def;
	public int gold;
	public String id;

	public Magician(String userId) {
		level = 1;
		mp = 20;
		def = 1;
		gold = 200;
		id = userId;
	}

	public void getStatus() {
		System.out.println(id);
		System.out.println(mp);
		System.out.println(def);
		System.out.println(level);
		System.out.println(gold);
	}

	public void huntMoster() {
		System.out.println("사냥 시작");
		mp -= 5;
		level += 1;
	}
	public void meditation() {
		mp = 20;
	}
}
