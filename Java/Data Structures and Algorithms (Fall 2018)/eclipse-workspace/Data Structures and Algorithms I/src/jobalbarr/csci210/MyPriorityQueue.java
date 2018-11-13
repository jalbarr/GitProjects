package jobalbarr.csci210;

import java.util.LinkedList;
import java.util.Queue;

public class MyPriorityQueue {

	private Queue<String> q1 = new LinkedList<String>();
	private Queue<String> q2 = new LinkedList<String>();
	private Queue<String> q3 = new LinkedList<String>();

	public void enqueue(int priority, String item) {

		if (priority == 1) {
			q1.add(item);
		} else if (priority == 2) {
			q2.add(item);
		} else if (priority == 3) {
			q3.add(item);
		} else {
			System.out.print("Invalid Priority! Please enter a valid queue priority!");
		}

	}

	public String dequeue() {
		String poppedItem;

		if (!q1.isEmpty()) {
			poppedItem = q1.remove();
		} else if (!q2.isEmpty()) {
			poppedItem = q2.remove();
		} else if (!q3.isEmpty()) {
			poppedItem = q3.remove();
		} else {
			poppedItem = "ALL LISTS ARE EMPTY!";
		}

		return poppedItem;
	}

	public boolean isEmpty() {

		return this.isEmpty();
	}

	public void peek() {
		System.out.printf("---PRIORITY QUEUE PEEK---\nq1 [");
		for (String item : q1) {
			System.out.printf("%s, ", item);
		}
		System.out.printf("]\n");

		System.out.printf("q2 [");
		for (String item : q2) {
			System.out.printf("%s, ", item);
		}
		System.out.printf("]\n");

		System.out.printf("q3 [");
		for (String item : q3) {
			System.out.printf("%s, ", item);
		}
		System.out.printf("]\n");
	}
}
