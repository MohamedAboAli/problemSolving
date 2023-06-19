package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.hpsf.Array;

public class GetRebeetedValuesOn2Arrays {

	// [2,5,9,2,8,1,8]
	// [8,3,0,2,8]

	// =[8,2,8]

	public static List<Integer> getValues(List<Integer> l1, List<Integer> l2) {

		HashMap<Integer, Integer> m1 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> m2 = new HashMap<Integer, Integer>();

		for (int i = 0; i < l1.size(); i++) {
			if (!m1.containsKey(l1.get(i))) {
				int key = l1.get(i);
				Integer value = Integer.valueOf(1);
				m1.put(key, value);
			} else {
				Integer value = m1.get(l1.get(i));
				m1.put(Integer.valueOf(l1.get(i)), Integer.valueOf(++value));
			}

		}

		for (int i = 0; i < l2.size(); i++) {

			if (!m2.containsKey(l2.get(i))) {
				m2.put(l2.get(i), 1);
			} else {
				Integer value = m2.get(l2.get(i));
				m2.put(l2.get(i), ++value);
			}

		}

		List result = new ArrayList<Integer>();
		for (int i = 0; i < l2.size(); i++) {

			if (m1.containsKey(l2.get(i)) && m2.containsKey(l2.get(i)) && m1.get(l2.get(i)) > 0
					&& m2.get(l2.get(i)) > 0) {

				int value1 = m1.get(l2.get(i));
				int value2 = m2.get(l2.get(i));
				result.add(l2.get(i));
				m1.put(l2.get(i), --value1);
				m2.put(l2.get(i), --value2);

			}

		}

		return result;
	}

	public static void main(String[] args) {
		List<Integer> l1, l2;
		int[] arr = { 2, 5, 9, 2, 8, 1, 8 };
		l1 = Arrays.stream(arr).boxed().collect(Collectors.toList());
		int[] arr1 = { 8, 3, 0, 2, 8 };
		l2 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
		System.out.println(getValues(l1, l2));

	}

}
