package jobalbarr.csci210;

public class Temp {
	static public void main(String[] arg) {
		int i = 30;
		float f = 30;
		System.out.println("i = " + i);
		System.out.println("f = " + f);
		System.out.println("i/8 = " + (i / 8));
		System.out.println("f/8 = " + (f / 8));
		System.out.println("i%8 = " + (i % 8));
		f = 17.3f;
		f = 125445.5654f;
		System.out.println("f/47 = " + (f / 47));
		for (int j = 1; j <= 20; j++) {
			System.out.println("f/" + j + " = " + (f / j));
		}
		for (int j = 1; j <= 20; j++) {
			System.out.printf("f/%2d = %9.2f\n", j, f / j);
		}
		for (int j = 1; j <= 12; j++) {
			System.out.printf("%2d %5d %7d %8.4f\n", j, j * j, j * j * j, Math.sqrt(j));
		}
	}
}