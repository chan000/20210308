package access;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car(0, 100, "찬");
		car.getCarInfo();
		car.carAccel();
		car.getCarInfo();
		car.carAccel();
		car.getCarInfo();
		car.carBreak();
		car.getCarInfo();
		car.carBreak();
		car.getCarInfo();
	}

}
