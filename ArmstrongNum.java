package week1.day1;

public class ArmstrongNum {

	public static void main(String[] args) {

		int input = 193;
		int calculate = 0;
		int rem;
		int original;

		original = input;

		while (input > 0) {
			rem = input % 10;
			calculate = calculate + (rem * rem * rem);
			input = input / 10;
		}
		if (calculate == original) {
			System.out.println("The Number is an Armstrong Number");
		} else {
			System.out.println("The Number is Not an Armstrong Number");
		}
	}
}
