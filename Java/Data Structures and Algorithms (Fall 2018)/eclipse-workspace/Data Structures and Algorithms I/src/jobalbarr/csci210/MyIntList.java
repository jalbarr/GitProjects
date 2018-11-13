package jobalbarr.csci210;
import java.util.Random;
public class MyIntList {

	private int cnt; // actual number of items in the buffer
	private int[] buf; // buffer for storing the items

	static final int INIT_BUF_SIZE = 6;
	static final double GROW_FACTOR = 1.3;

	public MyIntList() {
		cnt = 0;
		buf = new int[INIT_BUF_SIZE];
	}

	// min, max = range of random integer (both included)
	// example: randInt(3,8) will generate one of the random integers: 3,4,5,6,7,8.
	public int randInt(int min, int max) {
		// TODO #1
		// MUST USE THE FOLLOWING
		Random rand = new Random();
		return rand.nextInt(max - min + 1)+ min;
	}

	// cnt = number of random numbers in the list
	// min, max = range of random numbers (both included)
	// example: randomize (6, 12, 20) may generate: 13, 12, 19, 20, 16, 12
	// this method will destroy all previous contents, if any.
	public void randomize(int cnt, int min, int max) {
		// TODO #2
	}

	// returns true iff all numbers in the list is even
	public boolean isAllEven() {
		// TODO #3
		return false;
	}

	// reverse the order of all numbers in the list
	// example, if the list was [3,7,2,4]; then the list will be [4,2,7,3] after
	// reversing.
	public void reverse() {
		// TODO #4
	}

	// sort the numbers in the list
	// See zyBook 3.3.1 insertion sort
	public void sort() {
		// TODO #5
	}

	// grow the buffer
	private void grow() {
		boolean DEBUG = true;
		int newBufSize = (int) (GROW_FACTOR * buf.length);
		if (DEBUG) {
			System.out.printf("<[ DEBUG: growing buffer:  %d  --->  %d ]>\n", buf.length, newBufSize);
		}
		int[] newBuf = new int[newBufSize];
		for (int i = 0; i < cnt; i++) {
			newBuf[i] = buf[i];
		}
		buf = newBuf;
	}

	// add the given item to the end of this list
	public void addToEnd(int item) {
		if (cnt == buf.length) {
			grow();
		}
		buf[cnt] = item;
		cnt++;
	}

	// add the given item to the beginning of this list
	public void addToBeginning(int item) {
		if (cnt == buf.length) {
			grow();
		}
		for (int i = cnt - 1; i >= 0; i--) {
			buf[i + 1] = buf[i];
		}
		buf[0] = item;
		cnt++;
	}

	public boolean isEmpty() {
		return cnt == 0;
	}

	// print the contents of this list, separated by spaces, on one line
	public void peek() {
		System.out.print("<[ PEEK: ");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%d ", buf[i]);
		}
		System.out.println("]>");
	}

	// returns the number of items
	public int count() {
		return cnt;
	}

	// clear this list
	public void clear() {
		cnt = 0;
	}

	// return the item at the given position (first position is 0)
	public int get(int pos) {
		if (pos < 0 || pos >= cnt) {
			throw new RuntimeException("<[ ERROR:  get:  illegal pos=" + pos + " ]>");
		}
		return buf[pos];
	}

	// return position of the first item matching the key
	// returns -1 if not found
	public int findFirst(int key) {
		for (int i = 0; i < cnt; i++) {
			if (buf[i] == key) {
				return i;
			}
		}
		return -1;
	}

	// return position of the last item matching the key
	// returns -1 if not found
	public int findLast(int key) {
		for (int i = cnt - 1; i >= 0; i--) {
			if (buf[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public void delFromEnd() {
		if (cnt == 0) {
			throw new RuntimeException("<[ ERROR:  the list is already empty! ]>");
		}
		cnt--;
	}

	public void delFromBeginning() {
		// TODO
	}

	public int sum() {
		int ans = 0;
		for (int i = 0; i < cnt; i++) {
			ans += buf[i];
		}
		return ans;
	}

	public int freq(int key) {
		int ans = 0;
		for (int i = 0; i < cnt; i++) {
			if (buf[i] == key) {
				ans++;
			}
		}
		return ans;
	}

	public boolean found(int key) {
		for (int i = 0; i < cnt; i++) {
			if (buf[i] == key) {
				return true;
			}
		}
		return false;
	}

	public boolean isStrictlyIncreasing() {
		// There are 3 possible ways to handle empty list and singleton list.
		// - return false
		// - return false
		// - throw a RuntimeException
		// I choose to return true
		if (cnt < 1) {
			return true;
		}
		for (int i = 1; i < cnt; i++) {
			if (buf[i] <= buf[i - 1]) {
				return false;
			}
		}
		return true;
	}

}