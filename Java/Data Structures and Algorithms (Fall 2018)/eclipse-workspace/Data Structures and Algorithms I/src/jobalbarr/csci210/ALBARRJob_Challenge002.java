package jobalbarr.csci210;

//Write a method that when given an array of positive and negative numbers
//moves all the positive numbers to the beginning of the array

//Example:
//Original array : [-4, 8, 6, -5, 6, -2, 1, 2, 3, -11]
//New array : [8, 6, 6, 1, 2, -4, -5, -2, 3, -11]

//Write another method that verifies whether a given string is a valid email address and returns true or false.
//A valid email must satisfy the following conditions:
//The string must contain an '@' character.
//The string must contain a '.' character.
//The '@' must have at least one character in front of it.
//The '.' and the '@' must be in the appropriate places.

//Example:
// validEmail("@gmail.com") returns false
// validEmail("hello.gmail@com") returns false
// validEmail("gmail") returns false
// validEmail("hello@gmail") returns false
// validEmail("hello@edabit.com") returns true

public class ALBARRJob_Challenge002 {
	public static void movePositive(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if ((arr[j] > 0) && (arr[i] < 0)) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.print("[");
		for (int item : arr) {
			System.out.printf("%d, ", item);
		}
		System.out.print("]");
	}

	public static boolean validEmail(String s) {
		boolean hasPeriod = false;
		boolean hasAtSymbol = false;
		boolean isValid = false;
		String[] string = s.split("");

		for (int i = 0; i < string.length; i++) {

			if ((hasAtSymbol) || (string[i] == "@")) {
				hasAtSymbol = true;

				if ((hasPeriod) || (string[i] == ".")) {
					hasPeriod = true;
				}
			}
			if ((hasPeriod) && (hasAtSymbol)) {
				isValid = true;
			}

		}
		return isValid;
	}

	static public void main(String[] arg) {
		int[] array = { -4, 8, 6, -5, 6, -2, 1, 2, 3, -11 };
		movePositive(array);
		System.out.println();
		System.out.print(validEmail("hello@edabit.com"));

	}
}