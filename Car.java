package week1.day1;

public class Car {

	public static void main(String[] args) {

		System.out.println("In Main Method");
		Car myCar = new Car();
		System.out.println(myCar.color);
		myCar.driveCar();
		myCar.applyBrake();

	}

	String color = "Red";
	public void driveCar() {
		color = "Black";
		System.out.println(color);
		System.out.println("Drive Car");

	}

	public void applyBrake() {
		System.out.println(color);
		System.out.println("Apply Break");
	}
}
