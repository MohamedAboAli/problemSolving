package problemSolving.CF.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AhmedQuiz {

	static int fun(int arr[]) {
		int count = 0, element = 0, tempCount;
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> set1 = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (!set.add(arr[i])) {
				set1.add(arr[i]);
			}
		}

		Iterator setData = set1.iterator();

		while (setData.hasNext()) {
			tempCount = 0;
			Integer elem = Integer.parseInt(setData.next().toString());
			for (int j = 0; j < arr.length; j++) {

				if (elem == arr[j]) {
					tempCount++;

					if (tempCount > count) {
						count = tempCount;
						element = j;
					}
					if (count >= arr.length / 2) {
						break;
					}
				}

			}

		}

		return element;
	}

	static int fun2(int arr[]) {
		int elementCount = 0, finalElement = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int element : arr) {
			Integer count = map.get(element);
			if (count == null) {
				map.put(element, 1);
			} else {
				map.put(element, ++count);
			}
		}

		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() > elementCount) {
				elementCount = entry.getValue();
				finalElement = entry.getKey();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (finalElement == arr[i]) {
				return i;
			}
		}
		return 0;
	}

	public static int getMinimumUniqueSum(List<Integer> arr) {
		// Write your code here
		int sum = 0;
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> lastMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.size(); i++) {
			if (m.containsKey(arr.get(i))) {
				Integer value = m.get(arr.get(i));
				m.put(arr.get(i), ++value);
			} else {
				m.put(arr.get(i), 1);
			}

		}
lastMap.putAll(m);
		for (Entry<Integer, Integer> entry : m.entrySet()) {
			for (int j = 1; j < entry.getValue(); j++) {
				Integer key = entry.getKey();

				while (lastMap.containsKey(key)) {
					key++;
				}
				lastMap.put(key, 1);

			}
		}

		for (Map.Entry<Integer, Integer> entry : lastMap.entrySet()) {
			sum += entry.getKey();
		}

		return sum;
	}



	public static void main(String[] args) {

		int arr[] = { 4, 3, 3, 2, 2, 2, 2, 2, -1, 3, 3, 3, 3, 3 };
		List<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(1659);
		l.add(710);
		l.add(710);
		l.add(1730);
		l.add(1808);
		l.add(2043);
		l.add(1613);
		l.add(1841);
		l.add(1328);
		l.add(504);
		l.add(1730);
		l.add(2545);
		l.add(493);
		l.add(879);
		l.add(1441);
		l.add(2043);
		l.add(1613);
		l.add(710);
		l.add(1613);
		l.add(1250);
		
		
	
		System.out.println(getMinimumUniqueSum(l));
		System.out.println(fun(arr));
		System.out.println(fun2(arr));
	}
}
