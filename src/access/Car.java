package access;

public class Car {
	private int speed;
	private int gas;
	private String owner;

	public Car(int speed, int gas, String owner) {
		this.speed = speed;
		this.gas = gas;
		this.owner = owner;

	}
	// public 제한자인 getCarInfo를 생성해주세요.
	// 콘솔창에 전체 멤버변수 정보를 찍어줍니다.

	public void getCarInfo() {
		System.out.println("속도 : " + this.speed);
		System.out.println("연료 : " + this.gas);
		System.out.println("주인 : " + this.owner);
	}

	// Accel, Break 실행시 연료량과 속도가 0미만으로 내려갈 수 없게 로직 보완.
	public void carAccel() {
		if (this.gas <= 1) {
			this.gas = 0;
			return;

		}
		this.speed += 10;
		this.gas -= 0;

	}

	// carBreak 메서드 작성
	// 실행시 속도를 10 씩 감속.
	// 연료는 X
	public void carBreak() {
		if (this.speed < 10) {
			this.speed = 0;
			return;
		}
		this.speed -= 10;
	}

}
