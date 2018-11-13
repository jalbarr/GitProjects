package jobalbarr.csci210;

import java.util.ArrayList;
import java.util.List;

public class List_Demo1 {

	static public void main(String[] arg) {
		List<String> lstStr = new ArrayList<String>();
		System.out.println(lstStr.toString());

		lstStr.add("apple");
		System.out.println(lstStr.toString());
		lstStr.add("banana");
		System.out.println(lstStr.toString());
		lstStr.add("cherry");
		System.out.println(lstStr.toString());
		lstStr.add("cherry");
		System.out.println(lstStr.toString());
		lstStr.add(0, "kiwi");
		System.out.println(lstStr.toString());
		lstStr.add(3, "lemon");
		System.out.println(lstStr.toString());
		System.out.printf("The size of the list is %d. \n",lstStr.size());
		System.out.println(lstStr.isEmpty());
		
	}
}