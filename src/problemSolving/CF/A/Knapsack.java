package problemSolving.CF.A;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {

	public static double[] sizeValue;
	public static List<Integer> finalWeight;

	public static double getMaxValue(int[] w, int[] v, int c) {
		sizeValue = new double[w.length];
		finalWeight = new ArrayList<Integer>();
		for (int i = 0; i < w.length; i++) {
			sizeValue[i] = v[i] / w[i];
		}
		int currentCapacity = 0;
		double totalValue = 0.0;
		while (currentCapacity <= c) {
			int maxindex = getMaxIndex(sizeValue);
			int remiderWight = c - currentCapacity;
			currentCapacity += w[maxindex];

			if (currentCapacity < c) {
				finalWeight.add(w[maxindex]);
				totalValue += v[maxindex];
			} else {
				double getReminderwightValue = (double) (remiderWight) * v[maxindex] / w[maxindex];
				totalValue += getReminderwightValue;
			}

		}
		return totalValue;
	}

	public static int getMaxIndex(double[] arr) {
		int maxIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
		}
		arr[maxIndex] = -1;
		return maxIndex;
	}

	public static int[][] dp;

	public static void initalize(int elementNumber, int c) {
		dp = new int[elementNumber + 1][c + 1];
		for (int i = 0; i < elementNumber + 1; i++) {
			for (int j = 0; j < c + 1; j++) {
				dp[i][j] = -1;
			}
		}
	}

	public static int getKnapsackValueWraper(int[] w, int[] v, int c, int elementNumber) {

		initalize(elementNumber, c);
		return getKnapsackValue(w, v, c, elementNumber);
	}

	public static int getKnapsackValue(int[] w, int[] v, int c, int elementNumber) {

		if (elementNumber <= 0 || c == 0) {
			return 0;
		}
		if (dp[elementNumber - 1][c] != -1) {
			return dp[elementNumber - 1][c];
		}

		if (c < w[elementNumber - 1]) {
			return dp[elementNumber - 1][c] = getKnapsackValue(w, v, c, elementNumber - 1);
		}

		return dp[elementNumber - 1][c] = (Math.max(
				getKnapsackValue(w, v, c - w[elementNumber - 1], elementNumber - 1) + v[elementNumber - 1],
				getKnapsackValue(w, v, c, elementNumber - 1)));
	}

	public static int knapSackWithoutDP(int[] w, int[] v, int n, int c) {

		if (n <= 0) {
			return 0;
		}
		if (c < w[n - 1]) {
			return knapSackWithoutDP(w, v, n - 1, c);
		}

		return Math.max(knapSackWithoutDP(w, v, n - 1, c - w[n - 1]) + v[n - 1], knapSackWithoutDP(w, v, n - 1, c));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = { 60, 100, 120 };
		int[] weight = { 10, 20, 30 };
		// capacity of the knapsack
		int C = 50;
		int n = weight.length;
		// invoking the getMaxValue() method
		System.out.println(getMaxValue(weight, values, C));
		System.out.println(getKnapsackValueWraper(weight, values, C, n));
		System.out.println(knapSackWithoutDP(weight, values, n, C));

	}

}
