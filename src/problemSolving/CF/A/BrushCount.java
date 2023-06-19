package problemSolving.CF.A;

public class BrushCount {

	public int solution(int[] A) {
		// write your code in Java SE 8
		int brushCount = 0;
		int prevHeight = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > prevHeight)
				brushCount = brushCount + (A[i] - prevHeight);
			prevHeight = A[i];
		}
		return brushCount;
	}
	
}
