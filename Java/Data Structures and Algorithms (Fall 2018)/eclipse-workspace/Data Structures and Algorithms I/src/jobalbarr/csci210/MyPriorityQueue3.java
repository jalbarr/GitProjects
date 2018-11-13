package jobalbarr.csci210;

import java.util.LinkedList;
import java.util.Queue;

// 3 priority levels: 1=high, 2=normal, 3=low
public class MyPriorityQueue3 {

	private Queue<String> q1 = new LinkedList<String>();
	private Queue<String> q2 = new LinkedList<String>();
	private Queue<String> q3 = new LinkedList<String>();

	public void enqueue(int priority, String item) {
		switch (priority) {
		case 1:
			q1.add(item);
			break;
		case 2:
			q2.add(item);
			break;
		case 3:
			q3.add(item);
			break;
		default:
			throw new RuntimeException("Illegal priority=" + priority);
		}
	}

	public void _enqueue(int priority, String item) {
		if (priority == 1) {
			q1.add(item);
		} else if (priority == 2) {
			q2.add(item);
		} else if (priority == 3) {
			q3.add(item);
		} else {
			throw new RuntimeException("Illegal priority=" + priority);
		}
	}

	public boolean isEmpty() {
		return q1.isEmpty() && q2.isEmpty() && q3.isEmpty();
	}

	public String dequeue() {
		if (!q1.isEmpty()) {
			return q1.remove();
		}
		if (!q2.isEmpty()) {
			return q2.remove();
		}
		if (!q3.isEmpty()) {
			return q3.remove();
		}
		throw new RuntimeException("Cant deqqueue from an empty queue.");
	}

}
