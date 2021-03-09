package inheritance;

public class Main {

	public static void main(String[] args) {
		// Student랑 SalaryMan을 생성하고 임의 값을 부여.
		Student st1 = new Student();
		SalaryMan sm1 = new SalaryMan();

		st1.age = 23;
		st1.grade = 3;
		st1.job = "학쌩";
		st1.major = "컴공";
		st1.name = "김";
		st1.pnum = "010-2345-6123";
		sm1.age = 30;
		sm1.job = "개발자";
		sm1.name = "박";
		sm1.pnum = "123123";
		sm1.salary = 4000;
		st1.setGrade(4);
		

		st1.getInfo("--------------");
		sm1.getInfo();

	}

};