package jobalbarr.csci210;


public class MyPriorityQueue_Demo {

	public static void main(String[] arg) {
		// create a priority queue with 3 levels of priority: 1=high, 2=medium, 3=low
		MyPriorityQueue pq = new MyPriorityQueue();

		pq.enqueue(2, "apple");	// medium priority
		pq.enqueue(3, "candy");	// low priority
		pq.enqueue(1, "milk");	// high priority
		pq.enqueue(1, "cheese");// high priority
		pq.enqueue(2, "banana");// medium priority
		pq.peek();
		pq.dequeue();			// ----> milk come out first although it was not the first one enter the queue!
		pq.peek();
		pq.enqueue(3, "gum");	// low priority
		pq.dequeue();			// ----> cheese come out next
		pq.peek();
		pq.enqueue(2, "kiwi");	// low priority
		pq.dequeue();			// apple come out after ALL high priority items had dequeued.
		pq.dequeue();			// ----> banana
		pq.dequeue();			// ----> kiwi
		pq.peek();
		pq.enqueue(1, "fish");	// high priority
		pq.enqueue(2, "apple");	// medium priority
		pq.peek();
		pq.dequeue();			// ----> fish
		pq.dequeue();			// ----> apple
		pq.dequeue();			// ----> kiwi
		pq.dequeue();			// ----> candy
		pq.peek();
		pq.enqueue(2, "kiwi");	// medium priority
		pq.enqueue(1, "cheese");// high priority
		pq.peek();
	
	}
}
