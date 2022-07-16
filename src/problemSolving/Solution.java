package problemSolving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

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

	public int solution(String[] E) {
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i = 0; i < E.length; i++) {
			for (int j = 0; j < E[i].length(); j++) {
				int key = Character.getNumericValue(E[i].charAt(j));
				if (m.containsKey(key)) {
					int value = m.get(key);
					m.put(key, ++value);
				} else {
					m.put(key, 1);
				}
			}
		}

		List<Integer> list = new ArrayList<Integer>(m.keySet());
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (i != j) {
					int check=checkGreaterNumber(list.get(i), list.get(j), E);
					if(check>count) {
						count=check;
					}
				}
			}
		}
return count;
	}

	public int checkGreaterNumber(Integer first, Integer second, String[] E) {
		int count = 0;
		String firstString = first.toString();
		String secondString = second.toString();
		for (int i = 0; i < E.length; i++) {
			if (E[i].contains(firstString) || E[i].contains(secondString)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
