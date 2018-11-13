package jobalbarr.csci210;

public class MyIntList_Demo {

	static public void main(String[] arg) {
		MyIntList lst = new MyIntList();
		for (int i = 0; i < 30; i++) {
			System.out.printf("%d ", lst.randInt(2, 7));
		}
		System.out.println();

		lst.randomize(4, 27, 27);
		lst.peek();
		lst.randomize(10, 3, 7);
		lst.peek();
		lst.randomize(30, 1, 9);
		lst.peek();
		System.out.println("---------------------------------------------  ALL IS EVEN:");
		lst.randomize(4, 10, 30);
		lst.peek();
		// TODO #3a: print a message about all-number-is-even condition
		System.out.println("---------------------------------------------  REVERSE:");
		int count = lst.randInt(4, 20);
		lst.randomize(count, 20, 50);
		lst.peek();
		lst.reverse();
		lst.peek();
		System.out.println("---------------------------------------------  SORT:");
		count = lst.randInt(4, 20);
		lst.randomize(count, 20, 50);
		lst.peek();
		lst.sort();
		lst.peek();
	}

}
