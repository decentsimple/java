package practice;

public class ArrayWithIfElse {
	public static void main(String[] args) {
		int[] randomNumbers = {51, 108, 28};
		for (int number : randomNumbers) {
			if (number > 80) {
				System.out.println("This is higher than 80: " + number);
			} else if (number > 27) {
				System.out.println("this is higher than 27: " + number);
			} else {
				System.out.println("just print this out: " + number);
			}
		}
	}
}
