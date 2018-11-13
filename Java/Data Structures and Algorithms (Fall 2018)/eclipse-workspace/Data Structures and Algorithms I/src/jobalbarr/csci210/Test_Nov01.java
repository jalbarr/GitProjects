package jobalbarr.csci210;

import java.util.Stack;

public class Test_Nov01 {

	static public void main(String[] arg) {
		Stack<String> stack = new Stack<String>();
		stack.push("peach");
		stack.push("apple");
		stack.push("kiwi");
		stack.push("banana");
		stack.push("coconut");
		stack.push("chery");
		stack.push("orange");
		System.out.printf("stack has %d items\n", count(stack));
		System.out.printf("pop ==> %s\n", stack.pop());
		swapTopTwo(stack);
		System.out.printf("swapTopTwo    pop ==> %s\n", stack.pop());
		System.out.printf("multiPop(3)   pop ==>");
		String[] items = multiPop(stack, 3);
		for (int i = 0; i < items.length; i++) {
			System.out.printf("  %s", items[i]);
		}
	}

	// Correct output:
	//
	// stack has 7 items
	// pop ==> orange
	// swapTopTwo pop ==> coconut
	// multiPop(3) pop ==> chery banana kiwi
	//
	// Use only the following 3 methods on a stack: push(), pop() and isEmpty().
	// Absolutely NO other methods on stack can be used.
	//
	// ===================== DO NOT CHANGE ANYTHING ABOVE THIS LINE
	// ========================

	//Job Albarr;
	
	// return the number of the strings in the stack WITHOUT modifying its content
	static public int count(Stack<String> stack) {
		int count = 0;
		for (String item : stack) {
			if (item instanceof String) {
				count += 1;
			}
		}
		return count;
	}

	// swap the first and second (from the top) items
	// throws an Exception when there are less than k items
	static void swapTopTwo(Stack<String> stack) {

		int count = 0;
		for (String item : stack) {
			count += 1;
		}
		if (count >= 2) {

			String first = stack.pop();
			String second = stack.pop();
			stack.push(first);
			stack.push(second);

		} else {
			throw new ArithmeticException("Not enough items in stack to swap!");
		}
	}

	// pops k items from the stack and returns them as an array of strings
	// throws an Exception when there are less than k items
	static String[] multiPop(Stack<String> stack, int k) {
		String[] string = new String[k];
		int count = 0;
		for (String item : stack) {
			count += 1;
		}
		if (count >= k) {
			for (int i = 0; i < k; i++) {
				string[i] = stack.pop();
			}
		} else {
			throw new ArithmeticException("Not enough items in stack to multipop!");
		}
		return string;
	}

}
