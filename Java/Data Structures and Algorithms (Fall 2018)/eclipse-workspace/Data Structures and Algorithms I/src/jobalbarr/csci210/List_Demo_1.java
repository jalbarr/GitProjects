package jobalbarr.csci210;

import java.util.ArrayList;
import java.util.List;

public class List_Demo_1 {
	static public void main(String[] arg) {
		List<String> lst = new ArrayList<String>();

		System.out.println(lst.toString());
		System.out.printf("The list has %d items.\n", lst.size());
		System.out.printf("The list is %sempty.\n\n", lst.isEmpty() ? "" : "not ");

		lst.add("apple"); // append
		lst.add("banana"); // append
		System.out.println(lst.toString());
		System.out.printf("The list has %d items\n", lst.size());
		System.out.printf("The list is %sempty.\n", lst.isEmpty() ? "" : "not ");
		System.out.printf("Clearing the list ...\n\n");
		lst.clear();

		lst.add("pear");
		lst.add("lime");
		lst.add("orange");
		System.out.println("CHECK  1:  " + lst.toString());
		lst.add(1, "cherry"); // add at position 1, will move the rest down one slot
		System.out.println("CHECK  2:  " + lst.toString());
		// comment the following after confirming that it will throw an exception
		// lst.add(6, "cherry"); // can't add at position 6, will throw exception
		lst.add(1, "kiwi");
		lst.add(0, "coconut");
		System.out.println("CHECK  3:  " + lst.toString());
		lst.add(2, "lemon");
		lst.add(0, "pineapple");
		lst.add(0, "strawberry");
		System.out.println("CHECK  4:  " + lst.toString());
		lst.remove("kiwi");
		System.out.println("CHECK  5:  " + lst.toString());
		lst.remove("watermelon"); // no watermelon, will NOT cause exception!
		System.out.println("CHECK  6:  " + lst.toString());

		lst.add(2, "orange");
		lst.add(4, "orange");
		lst.add(3, "lime");
		System.out.println("CHECK  7:  " + lst.toString());
		lst.add(lst.size() - 1, "peach");
		System.out.println("CHECK  8:  " + lst.toString());

		lst.remove("orange"); // remove the first orange
		System.out.println("CHECK  9:  " + lst.toString());
		lst.remove("orange"); // remove the first of the remaining orange
		System.out.println("CHECK 10:  " + lst.toString());

		lst.remove(0);
		System.out.println("CHECK 11:  " + lst.toString());

		lst.add(3, "peach");
		lst.add(5, "peach");
		System.out.println("CHECK 12:  " + lst.toString());

		System.out.printf("\nfirst occurrence of peach is at pos=%d\n", lst.indexOf("peach"));
		System.out.printf("last  occurrence of peach is at pos=%d\n", lst.lastIndexOf("peach"));
		System.out.printf("first occurrence of mango is at pos=%d\n", lst.indexOf("mango"));
		System.out.printf("last  occurrence of mango is at pos=%d\n", lst.lastIndexOf("mango"));
	}
}
