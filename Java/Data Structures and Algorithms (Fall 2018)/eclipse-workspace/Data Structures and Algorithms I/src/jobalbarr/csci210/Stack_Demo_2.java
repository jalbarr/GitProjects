package jobalbarr.csci210;

import java.util.Stack;

public class Stack_Demo_2 {

	static public void main(String[] arg) {
		Stack<String> stack = new Stack<String>();

		stack.push("apple");
		stack.push("banana");
		stack.push("cherry");
		stack.push("kiwi");
		stack.push("orange");
		stack.push("peach");

		while (!stack.isEmpty()) {
			System.out.printf("%s ", stack.pop());
		}

	}

}