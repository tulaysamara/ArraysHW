
public class secondQuestion {
	public static void main(String[] args) {

		double[] exampleArray = { 1, 5, 6, 5, 4, 1 };

		double maximum = exampleArray[0];

		int index = 0;

		for (int i = 1; i < exampleArray.length; i++) {
			if (exampleArray[i] > maximum) {

				maximum = exampleArray[i];

				index = i;
			}

		}

		System.out.println(index);

	}
}

// THE OUTPUT OF THE CORRECTED CODE WOULD BE "2"
//THERE WERE TWO ERRORS FOUND IN THE CODE THAT WERE CORRECTED 