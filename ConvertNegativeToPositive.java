package week1.day1;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {

		int num = -11;

		if (num < 0) {
			num = num * -1;
			System.out.println("Number After converting to Positive is ->->" + num);
		} else {
			System.out.println(num + "->-> It is a Positive Number");
		}

	}
}
