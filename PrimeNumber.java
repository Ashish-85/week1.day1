package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {

		int input = 11;

		boolean flag = true;

		for (int i = 2; i < input / 2; i++) {
			if (input % 2 == 0) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("Given Number is a Prime Number");
		} else {
			System.out.println("Given Number is Not a Prime Number");

		}

	}
}