package jobalbarr.csci210;

import java.util.Stack;

public class Stack_Demo_1 {

	static public void main(String[] arg) {
		Stack<String> stack = new Stack<String>();

		if (stack.isEmpty()) {
			System.out.println("The stack is empty.");
		} else {
			System.out.println("The stack is not empty.");
		}

		stack.push("apple");
		stack.push("banana");
		stack.push("orange");

		if (stack.isEmpty()) {
			System.out.println("The stack is empty.");
		} else {
			System.out.println("The stack is not empty.");
		}

		String s = stack.pop();
		System.out.printf("\"%s\" just popped from the stack.\n", s);
		s = stack.pop();
		System.out.printf("\"%s\" just popped from the stack.\n", s);

		stack.push("cherry");
		stack.push("mango");

		s = stack.pop();
		System.out.printf("\"%s\" just popped from the stack.\n", s);

		stack.pop();
		s = stack.pop();
		System.out.printf("\"%s\" just popped from the stack.\n", s);

		// will throw EmptyStackException
		// stack.pop();
		if (!stack.isEmpty()) {
			stack.pop();
		}

	}

}