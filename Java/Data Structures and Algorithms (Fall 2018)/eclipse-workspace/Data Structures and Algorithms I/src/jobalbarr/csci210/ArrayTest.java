package jobalbarr.csci210;

public class ArrayTest {

	public static void main(String[] arg) {

		int[] a = new int[3];
		a[0] = 45;
		a[1] = -5601;
		System.out.println("Hello");
		a[2] = 2344;
		try {
			a[3] = -7787;
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Hello again!");
	}

}
