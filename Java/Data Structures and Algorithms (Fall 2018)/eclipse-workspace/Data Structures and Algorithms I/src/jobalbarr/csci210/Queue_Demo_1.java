package jobalbarr.csci210;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue_Demo_1 {

  static public void main(String[] arg) {
    Queue<String> queue = new LinkedList<String>();
    Stack<String> stack = new Stack<String>();

    queue.add("apple"); // enqueue
    queue.add("mango");
    queue.add("coconut");

    String s = queue.remove(); // dequeue
    System.out.printf("just dequeued:  %s\n", s);

    stack.push("apple");
    stack.push("banana");
    stack.push("orange");

    s = stack.pop(); 
    System.out.printf("just popped:  %s\n", s);
  }

}
