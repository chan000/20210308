package object;

public class Warrior {

	public int level;
	public int hp;
	public int atk;
	public String id;

	public void getStatus() {
		System.out.println(id);
		System.out.println(level);
		System.out.println(hp);
		System.out.println(atk);
	}

	public Warrior(String userid) {
		System.out.println("전사 아이디 생성중입니다.");
		level = 1;
		hp = 20;
		atk = 3;
		id = "전사임";
	}

	public void huntMonster() {
		System.out.println("사냥을 시작합니다");
		hp -= 3;
		level += 3;
	}
	public void heal() {
		hp = 20;
	}

}
