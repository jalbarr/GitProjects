package jobalbarr.csci210;

import java.util.ArrayList;
import java.util.List;

public class List_Demo_3 {

	static public void main(String[] arg) {
		List<MyBook> lst = new ArrayList<MyBook>();

		lst.add(new MyBook("How to swim", 120, 17.3));
		lst.add(new MyBook("My sister's firest birthday party", 30, 25.99));
		System.out.println(lst.toString() + "\n");

	}

}