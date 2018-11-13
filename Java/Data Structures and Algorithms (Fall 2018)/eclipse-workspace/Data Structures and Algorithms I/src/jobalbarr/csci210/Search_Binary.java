package jobalbarr.csci210;

public class Search_Binary {

	static public void main(String[] arg) {
		new Search_Binary().go();
	}

	//

	//int[] list = { 14, 51, 83, 26, 45, 26 }; //unsorted
	int[] list = { 14, 26, 26, 45, 51, 83 }; //sorted

	void printList() {
		System.out.printf("Numbers in the list: ");
		for (int i = 0; i < list.length; i++) {
			System.out.printf(" %d", list[i]);
		}
		System.out.printf("\n");
	}

	// see fig 2.2.1 binary search algorithm, zyBook
	static int posInList_BinarySearch(int[] list, int key) {
		int mid = 0;
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			mid = (high + low) / 2;
			if (list[mid] < key) {
				low = mid + 1;
			} else if (list[mid] > key) {
				high = mid - 1;
			} else {
				return mid; // found
			}
		}
		return -1; // not found
	}

	void go() {
		System.out.printf("---  Binary Search of sorted list  ---\n");
		printList();

		int key, pos;

		key = 45;
		pos = posInList_BinarySearch(list, key);
		if (pos >= 0) {
			System.out.printf("The key %d is found in pos %d the list.\n", key, pos);
		} else {
			System.out.printf("The key %d is NOT found in the list.\n", key);
		}

		key = 26;
		pos = posInList_BinarySearch(list, key);
		if (pos >= 0) {
			System.out.printf("The key %d is found in pos %d the list.\n", key, pos);
		} else {
			System.out.printf("The key %d is NOT found in the list.\n", key);
		}

		key = 87;
		pos = posInList_BinarySearch(list, key);
		if (pos >= 0) {
			System.out.printf("The key %d is found in pos %d the list.\n", key, pos);
		} else {
			System.out.printf("The key %d is NOT found in the list.\n", key);
		}
	}

}
