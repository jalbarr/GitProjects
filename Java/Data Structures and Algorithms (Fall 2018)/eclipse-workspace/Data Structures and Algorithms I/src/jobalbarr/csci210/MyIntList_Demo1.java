package jobalbarr.csci210;

public class MyIntList_Demo1 {

  static public void main(String[] arg) {
    MyIntList lst = new MyIntList();

    System.out.printf("the list has %d numbers\n", lst.count());
    System.out.printf("the list is " + (lst.isEmpty() ? "" : "NOT ") + "empty\n");

    System.out.println("add 47 to end of list");
    lst.addToEnd(47);
    System.out.printf("the list is " + (lst.isEmpty() ? "" : "NOT ") + "empty\n");

    System.out.println("add 5 to end of list");
    lst.addToEnd(5);
    lst.peekLowLevel();
    lst.peekHighLevel();
    System.out.printf("the list has %d numbers\n", lst.count());
    lst.clear();

    lst.addToEnd(300);
    lst.addToEnd(19);
    lst.addToEnd(128);
    lst.addToEnd(77);
    lst.addToEnd(14);
    lst.addToEnd(77);
    lst.addToEnd(1523);
    lst.peekLowLevel();
    lst.peekHighLevel();

    int pos = -123;
    try {
      System.out.printf("item at pos=%d is %d\n", pos, lst.get(pos));
    } catch (Exception e) {
      System.out.println(e);
    }

    pos = 4;
    try {
      System.out.printf("item at pos=%d is %d\n", pos, lst.get(pos));
    } catch (Exception e) {
      System.out.println(e);
    }

    int key = 62;
    pos = lst.findFirst(key);
    if (pos < 0) {
      System.out.printf("item %d is not found in the list\n", key);
    } else {
      System.out.printf("item %d is first found at pos=%d\n", key, pos);
    }

    key = 77;
    pos = lst.findFirst(key);
    if (pos < 0) {
      System.out.printf("item %d is not found in the list\n", key);
    } else {
      System.out.printf("item %d is first found at pos=%d\n", key, pos);
    }

    pos = lst.findLast(key);
    if (pos < 0) {
      System.out.printf("item %d is not found in the list\n", key);
    } else {
      System.out.printf("item %d is last found at pos=%d\n", key, pos);
    }

    lst.addToBeginning(771);
    lst.addToBeginning(962);
    lst.addToBeginning(5870);
    lst.peekLowLevel();
    lst.peekHighLevel();
  }

}
