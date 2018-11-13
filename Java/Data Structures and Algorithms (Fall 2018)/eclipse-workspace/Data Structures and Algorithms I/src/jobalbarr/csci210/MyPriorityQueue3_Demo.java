package jobalbarr.csci210;

public class MyPriorityQueue3_Demo {

	public static void main(String[] arg) {
		MyPriorityQueue3 pq = new MyPriorityQueue3();

		pq.enqueue(2, "apple");
		pq.enqueue(3, "candy");
		pq.enqueue(1, "milk");
		pq.enqueue(1, "cheese");
		pq.enqueue(2, "banana");
		System.out.printf("C01:  %s\n", pq.dequeue()); // milk
		pq.enqueue(3, "gum");
		System.out.printf("C02:  %s\n", pq.dequeue()); // cheese
		pq.enqueue(2, "kiwi");
		System.out.printf("C03:  %s\n", pq.dequeue()); // apple
		System.out.printf("C04:  %s\n", pq.dequeue()); // banana
		System.out.printf("C05:  %s\n", pq.dequeue()); // kiwi
		pq.enqueue(1, "fish");
		pq.enqueue(2, "apple");
		System.out.printf("C06:  %s\n", pq.dequeue()); // fish
		System.out.printf("C07:  %s\n", pq.dequeue()); // apple
		pq.enqueue(3, "chips");
		System.out.printf("C08:  %s\n", pq.dequeue()); // candy
		System.out.printf("C09:  %s\n", pq.dequeue()); // gum
		pq.enqueue(2, "kiwi");
		pq.enqueue(1, "cheese");
		System.out.printf("C10:  %s\n", pq.dequeue()); // cheese
		pq.enqueue(2, "kiwi");
		pq.enqueue(2, "orange");
		System.out.printf("C11:  %s\n", pq.dequeue()); // kiwi
		try {
			pq.enqueue(4, "cup");
		} catch (Exception e) {
			System.out.printf("enqueue(4, \"cup\") ---> " + e.toString());
		}
		pq.enqueue(3, "chips");
		pq.enqueue(1, "milk");
		// dequeue repeatedly until empty:
		int check = 11;
		while (!pq.isEmpty()) {
			System.out.printf("C%d:  %s\n", check++, pq.dequeue());
		}

	}

}
