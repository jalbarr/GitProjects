package jobalbarr.csci210;

import java.util.Random;

public class Knapsack {

	public static void main(String[] args) {
		new Knapsack().go();
	}

	Random rand = new Random();

	String[] lbl = { "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S","T", "U", "V"};
	double[] val = { 9, 5, 10, 20, 3, 14, 47, 13, 18, 6, 21, 25, 20, 17, 5, 14, 10, 18, 3, 14 };
	double[] wt = { 4, 3, 7, 14, 1, 19, 31, 7, 15, 3, 6, 18, 11, 21, 8, 8, 14, 11, 2, 4 };
	boolean[] pick;
	void go() {
		int boxCnt = lbl.length;
		pick = new boolean[boxCnt];
		for (int i = 0; i < boxCnt; i++) {
			pick[i] = false;
		}
		double priceRatio = 0;
		double bestRatio = 0;
		double totalValue = 0;
		double totalWeight = 0;
		double limitWeight = 50;
		double newTotalWeight = 0;
		int itemsUsed = 0;

		while ((newTotalWeight <= limitWeight) && (itemsUsed < boxCnt)) {
			itemsUsed = 0;
			for (boolean item : pick) {
				if (item == true) {
					itemsUsed++;
				}
			}

			bestRatio = 0;
			for (int i = 0; i < boxCnt; i++) {

				priceRatio = val[i] / wt[i];
				newTotalWeight = totalWeight + wt[i];
				if (newTotalWeight <= limitWeight) {

					if ((priceRatio > bestRatio) && (pick[i] == false)) {

						bestRatio = priceRatio;

						pick[i] = true;

					}
				}
			}
			for (int i = 0; i < boxCnt; i++) {

				if (pick[i]) {
					newTotalWeight = totalWeight + wt[i];
					if (newTotalWeight <= limitWeight) {
						totalValue += val[i];
						totalWeight = newTotalWeight;

						System.out.println(i);

						System.out.printf("Chosen: %s   Ratio: %f   Current Weight: %f   Current Value: %f \n", lbl[i], bestRatio, totalWeight, totalValue);

					} else {
						pick[i] = false;
					}

				}
			}
		}
		System.out.print("Boxes picked: ");

		for (int i = 0; i < boxCnt; i++) {

			if (pick[i]) {
				System.out.printf(" %s ", lbl[i]);
			}
		}
		System.out.printf("\nTotal Value: %1.0f\nTotal Weight: %1.0f\n", totalValue, totalWeight);

	}
}
