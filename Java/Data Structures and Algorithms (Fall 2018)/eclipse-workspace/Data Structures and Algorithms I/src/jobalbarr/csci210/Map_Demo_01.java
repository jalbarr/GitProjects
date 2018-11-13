package jobalbarr.csci210;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Map_Demo_01 {

	static public void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		String s = map.put(34, "apple");
		map.put(15, "cherry");
		map.put(27, "banana");
		System.out.printf("%d ---> %s\n", 34, map.get(34));
		System.out.printf("%d ---> %s\n", 15, map.get(15));
		System.out.printf("%d ---> %s\n", 27, map.get(27));
		System.out.printf("%d ---> %s\n", 49, map.get(49));
		System.out.printf("%s ---> %s\n", "Dover", map.get("Dover"));
		System.out.printf("%s ---> %s\n", "red", map.get(Color.red));
		
		map.put(34, "kiwi");
		System.out.printf("%d ---> %s\n", 34, map.get(34));


	}
}
