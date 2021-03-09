package struct;

public class structTest {

	public static void getWarruirStatus(structEx ac) {
		System.out.println("아이디 : " + ac.id);
		System.out.println("레벨 : " + ac.level);
		System.out.println("체력: " + ac.hp);
		System.out.println("공격력 : " + ac.atk);
	}
	public static void getMagicianStatus(magician mc) {
		System.out.println("아이디: "+mc.name);
		System.out.println("체력: "+mc.hp);
		System.out.println("마나: "+ mc.mp);
		System.out.println("공격력 : " + mc.atk);
	}

	public static void main(String[] args) {

		structEx w1 = new structEx();
		w1.atk = 3;
		w1.hp = 20;
		w1.level = 1;
		w1.id = "전사1";
		getWarruirStatus(w1);
		
		structEx w2 = new structEx();
		w2.atk = 4;
		w2.hp = 50;
		w2.level = 9;
		w2.id = "전사2";
		getWarruirStatus(w2);
		
		magician m1 = new magician();
		m1.atk = 10;
		m1.hp = 15;
		m1.mp = 70;
		m1.name  = "법사1";
		getMagicianStatus(m1);
	}

}
