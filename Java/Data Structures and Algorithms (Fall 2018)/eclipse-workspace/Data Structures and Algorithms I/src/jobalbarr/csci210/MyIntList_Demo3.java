package jobalbarr.csci210;

public class MyIntList_Demo3 {

	static public void main(String[] arg) {

		MyIntList lst = new MyIntList();
		System.out.printf("lst = new MyIntList()\n");
		lst.peekLowLevel();
		lst.peekHighLevel();

		System.out.printf("\naddToEnd(15)\n");
		lst.addToEnd(15);
		lst.peekLowLevel();
		lst.peekHighLevel();

		System.out.printf("\naddToEnd(27)\n");
		lst.addToEnd(27);
		lst.peekLowLevel();
		lst.peekHighLevel();

		System.out.printf("\naddToBeginning(36)\n");
		lst.addToBeginning(36);
		lst.peekLowLevel();
		lst.peekHighLevel();

		System.out.printf("\naddAtPos(1,28)\n");
		lst.addAtPos(1, 28);
		lst.peekLowLevel();
		lst.peekHighLevel();

		System.out.printf("\naddToBeginning(35)\n");
		lst.addToBeginning(35);
		lst.peekLowLevel();
		lst.peekHighLevel();

		System.out.printf("\ndelAtPos(3)\n");
		lst.delAtPos(3);
		lst.peekLowLevel();
		lst.peekHighLevel();

		System.out.printf("\naddToBeginning(12)\n");
		lst.addToBeginning(12);
		lst.peekLowLevel();
		lst.peekHighLevel();

		System.out.printf("\naddAtPos(2,19)\n");
		lst.addAtPos(2, 19);
		lst.peekLowLevel();
		lst.peekHighLevel();

		System.out.printf("\naddToBeginning(59)\n");
		lst.addToBeginning(59);
		lst.peekLowLevel();
		lst.peekHighLevel();

		System.out.printf("\naddAtPos(4,46)\n");
		lst.addAtPos(4, 46);
		lst.peekLowLevel();
		lst.peekHighLevel();

		System.out.printf("\naddToBeginning(33)\n");
		lst.addToBeginning(33);
		lst.peekLowLevel();
		lst.peekHighLevel();

		System.out.printf("\ndelAtPos(5)\n");
		lst.delAtPos(5);
		lst.peekLowLevel();
		lst.peekHighLevel();
	}

}
