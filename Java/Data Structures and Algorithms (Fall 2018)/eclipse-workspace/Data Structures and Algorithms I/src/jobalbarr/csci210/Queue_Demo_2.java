package jobalbarr.csci210;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Queue_Demo_2 {

  static public void main(String[] arg) {

    Stack<String> stack = new Stack<String>();
    stack.push("apple");
    stack.push("banana");
    stack.push("cherry");
    stack.push("kiwi");
    stack.push("orange");
    stack.push("peach");
    System.out.printf("pop the stack repeatedly until it is empty:\n   ");
    while (!stack.isEmpty()) {
      System.out.printf("%s ", stack.pop());
    }
    
    Queue<String> queue = new LinkedList<String>();
    queue.add("apple"); // enqueue
    queue.add("banana");
    queue.add("cherry");
    queue.add("kiwi");
    queue.add("orange");
    queue.add("peach");
    System.out.printf("\ndequeue the queue repeatedly until it is empty:\n   ");
    while (!queue.isEmpty()) {
      System.out.printf("%s ", queue.remove());
    }
  }

}
