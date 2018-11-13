package jobalbarr.csci210;

import java.util.Random;

public class OldKnapsack {

	static public void main(String[] arg) {
		new OldKnapsack().go();
	}

	Random rand = new Random();

	String[] lbl = { "A", "B", "C", "D", "E", "F", "G" };
	double[] val = { 9, 5, 10, 20, 3, 14, 47 };
	double[] wt = { 4, 3, 7, 14, 1, 19, 31 };
	boolean[] pick;

	void go() {
		int boxCnt = lbl.length;
		pick = new boolean[boxCnt];
		for (int i = 0; i < boxCnt; i++) {
			pick[i] = rand.nextInt(2) == 0;
		}
		double totalVal = 0;
		double totalWt = 0;
		double limitWt = 50;
		for (int i = 0; i < boxCnt; i++) {
			if (pick[i]) {
				double newTotalWt = totalWt + wt[i];
				if (newTotalWt <= limitWt) {
					totalVal += val[i];
					totalWt = newTotalWt;
				} else {
					pick[i] = false;
				}
			}
		}
		System.out.printf("Boxes picked: ");
		for (int i = 0; i < boxCnt; i++) {
			if (pick[i]) {
				System.out.printf(" %s", lbl[i]);
			}
		}
		System.out.printf("\nTotal val: %1.0f\nTotal wt: %1.0f\n", totalVal, totalWt);
	}

}