package inheritance;

public class Person {
	public String name;
	public String job;
	public int age;
	public String pnum;
	// 내부 4개 변수를 콘솔창에 찍는 메서드 getInfo 작성

	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("직업 : " + job);
		System.out.println("나이 : " + age);
		System.out.println("번호 : " + pnum);
	}
}
