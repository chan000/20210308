package inheritance;

public class Student extends Person {
	public int grade;
	public String major;

	
	@Override
	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("직업 : " + job);
		System.out.println("나이 : " + age);
		System.out.println("번호 : " + pnum);
		System.out.println("학년 : " + grade);
		System.out.println("직업 : " + major);

	}

	public void getInfo(String finish) {
		System.out.println("이름 : " + name);
		System.out.println("직업 : " + job);
		System.out.println("나이 : " + age);
		System.out.println("번호 : " + pnum);
		System.out.println("학년 : " + grade);
		System.out.println("직업 : " + major);
		System.out.println(finish);

		
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}
