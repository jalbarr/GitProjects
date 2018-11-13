package jobalbarr.csci210;

public class Search_Linear {

	static public void main(String[] arg) {

		new Search_Linear().go();
	}

	int[] lst = { 33, 25, 17, 80, 17, 42 };

	static void printList(int[] list) {
		System.out.printf("The numbers in the list: ");
		for (int i = 0; i < list.length; i++) {
			System.out.printf(" %d", list[i]);
		}
		System.out.printf("\n");

	}

	static int posInList_LinearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == key) {
				return i; // found ! exit the loop immediately!
			}
		}
		return -1; // not found

	}

	void go() {
		System.out.printf("---  Linear search of unsorted list  ---\n");
		printList(lst);
		int key, pos;

		key = 25;
		pos = posInList_LinearSearch(lst, key);
		if (pos >= 0) {
			System.out.printf("Number %d is found at pos %d.\n", key, pos);
		} else {
			System.out.printf("Number %d is NOT found.\n", key);
		}

		key = 17;
		pos = posInList_LinearSearch(lst, key);
		if (pos >= 0) {
			System.out.printf("Number %d is found at pos %d.\n", key, pos);
		} else {
			System.out.printf("Number %d is NOT found.\n", key);
		}

		key = 55;
		pos = posInList_LinearSearch(lst, key);
		if (pos >= 0) {
			System.out.printf("Number %d is found at pos %d.\n", key, pos);
		} else {
			System.out.printf("Number %d is NOT found.\n", key);
		}
	}
}
