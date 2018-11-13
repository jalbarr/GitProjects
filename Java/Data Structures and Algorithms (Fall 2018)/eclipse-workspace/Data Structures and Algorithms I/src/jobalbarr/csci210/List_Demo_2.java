package jobalbarr.csci210;

import java.util.ArrayList;
import java.util.List;

public class List_Demo_2 {

	static public void main(String[] arg) {

		List<String> lstStr = new ArrayList<String>();
		List<Integer> lstInt = new ArrayList<Integer>();
		List<Boolean> lstBool = new ArrayList<Boolean>();
		List<Double> lstDbl = new ArrayList<Double>();

		lstStr.add("apple");
		lstStr.add("banana");
		lstStr.add(1, "cherry");
		lstStr.add(1, "kiwi");
		lstStr.add(0, "coconut");
		System.out.println(lstStr.toString());
		lstStr.sort(null);
		System.out.println(lstStr.toString() + "\n");

		lstInt.add(35);
		lstInt.add(71 + 12);
		lstInt.add(1, 18);
		lstInt.add(1, 33);
		lstInt.add(0, 52);
		System.out.println(lstInt.toString());
		lstInt.sort(null);
		System.out.println(lstInt.toString() + "\n");

		lstBool.add(true);
		lstBool.add(false || (true && false));
		lstBool.add(3 == 1 + 1);
		lstBool.add(1, 5 > 0);
		System.out.println(lstBool.toString() + "\n");
		lstBool.sort(null);
		System.out.println(lstBool.toString() + "\n");

		lstDbl.add(1.0);
		lstDbl.add(2.5);
		lstDbl.add(3.0 / 7.0);
		lstDbl.add(2, 987.0);
		System.out.println(lstDbl.toString());
		lstDbl.sort(null);
		System.out.println(lstDbl.toString() + "\n");

		// my customized display of the contents of lstDbl:
		System.out.printf("My list of doubles:  ");
		for (double x : lstDbl) {
			System.out.printf("%4.2f  ", x);
		}
		System.out.printf("\n");
	}
}
