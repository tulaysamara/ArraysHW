import java.util.Arrays;

public class thirdQuestion {

	public static void main(String[] args) {

		int power = 2;
		int size = 4;

		int[] result = toPower(size, power);
		System.out.println(Arrays.toString(result));

	}

	public static int[] toPower(int size, int power) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = (int) Math.pow(i, power);
		}
		return array;
	}
}