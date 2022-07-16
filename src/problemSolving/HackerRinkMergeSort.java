package problemSolving;

import java.util.ArrayList;
import java.util.List;

public class HackerRinkMergeSort {

	public static int largestCountValue(List<Integer> a) {
		// Write your code here
		int count = 0;
		if (a.size() < 2) {
			int n1 = 0;
			int n2 = 0;

			if (a.size() % 2 == 0) {
				n1 = a.size() / 2;
			} else {
				n1 = (a.size() / 2) + 1;
			}
			List<Integer> r = new ArrayList<Integer>();
			List<Integer> l = new ArrayList<Integer>();
			int lastElementInArr = 0;
			for (int i = 0; i < n1; i++) {
				l.add(a.get(i));
				lastElementInArr = i + 1;
			}

			for (int i = 0; i < n2; i++) {
				r.add(a.get(lastElementInArr + i));
			}

			largestCountValue(l);
			largestCountValue(r);
			count += merge(l, r);

		}
		return count;
	}

	public static int merge(List<Integer> l, List<Integer> r) {
		int i = 0, j = 0, count = 0;
		while (i < l.size() && j < r.size()) {
			if (l.get(i) <= r.get(j)) {
				i++;
			} else {
				count++;
				j++;
			}
		}

		return count;

	}

	
	public static void main(int[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(2);
		l.add(1);
		l.add(3);
		largestCountValue(l);
		
	}
}
