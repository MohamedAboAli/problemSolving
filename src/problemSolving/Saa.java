package problemSolving;

public class Saa {

	public static int knapSackAlgorthizm(int w, int wt[], int val[], int n, int sum, int i) {

		if (w < 0) {
			return 0;
		}
		if (i == n) {
			
				return sum;
			
		}

		return Math.max(knapSackAlgorthizm(w - wt[i], wt, val, n, sum + val[i], i+1),
				knapSackAlgorthizm(w, wt, val, n, sum, i+1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = { 60, 100, 120 };
		int[] weights = { 10, 20, 30 };
		int weight = 50;
		System.out.println(knapSackAlgorthizm(weight, weights, values, 3, 0, 0));
	}

}
