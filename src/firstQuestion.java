
public class firstQuestion {

	public static void main(String[] args) {
		int[] numbers = { 2, 4, 6, 8 };

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}

		System.out.println("The sum is: " + sum);
	}

}
