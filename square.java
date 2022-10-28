package homework;

public class square {
	public static void main(String[] args) {
		int number = 18;

		System.out.println("can bac hai cua " + number + " la " + getSquare(number));

	}

	private static double getSquare(int number) {
		double a;
		double result = number / 2;
		do {
			a = result;
			result = Math.round(100.00*(a + number / a) / 2)/100.00;
		} while (a != result);
		return result;
	}

}
//O(n)
