package jobalbarr.csci210;

import java.util.Random;

public class MyStrStack {

	private int cnt; // actual number of items in the buffer
	private String[] buf; // buffer for storing the items
	private double GROW_FACTOR = 1.5;

	public MyStrStack() {
		cnt = 0;
		buf = new String[5];
	}

	//
	//

	// insert the 'item' at position 'pos', moving existing items if necessary.

	private String[] getNewBuf(int bufIncrease) {

		int newBufSize = buf.length + bufIncrease;
		return new String[newBufSize];
	}

	private void grow() {
		boolean DEBUG = true;
		int newBufSize = (int) (GROW_FACTOR * buf.length);
		if (DEBUG) {
			System.out.printf("<[ growing buffer: size %d --> %d ]>\n", buf.length, newBufSize);
		}
		String[] newBuf = getNewBuf(newBufSize);
		for (int i = 0; i < cnt; i++) {
			newBuf[i] = buf[i];
		}
		buf = newBuf;
	}


	// add the given item to the end of this list
	public void push(String item) {
		if (cnt == buf.length) {
			grow();
		}
		buf[cnt] = item;
		cnt++;
	}

	public boolean isEmpty() {
		return cnt == 0;
	}

	public void clear() {
		cnt = 0;
	}

	public void pop() {

		cnt--;
	}

}
