package jobalbarr.csci210;

import java.util.Random;

public class RandomNumPlay {

	static public void main(String[] arg) {
		new RandomNumPlay().go();
	}

	Random rand = new Random();

	void go() {

		// System.out.printf("Hello!\n\n\n\nHello Again!\n");
		for (int i = 0; i < 100; i++) {
			System.out.printf("%d, ", rand.nextInt(6)+12);
		}
	}
}
