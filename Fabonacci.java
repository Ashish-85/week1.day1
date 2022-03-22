package week1.day1;

public class Fabonacci {

	public static void main(String[] args) {

		int input = 10;
		int numb1 = 0;
		int numb2 = 1;
		int numb3;

		for (int i = 0; i <= input; i++) {

			numb3 = numb1 + numb2;
			System.out.println(numb3);
			numb1 = numb2;
			numb2 = numb3;

		}

	}

}
