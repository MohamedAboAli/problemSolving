package problemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ClosestNumber {

	public static void closestNumbers(List<Integer> numbers) {

		TreeMap<Integer, Integer> hashContent = new TreeMap<Integer, Integer>();
		int min = 999999999, check, count = 0;

		for (int i = 0; i < numbers.size(); i++) {

			for (int j = 1; j < numbers.size(); j++) {
				if (i != j) {

					check = numbers.get(i) - numbers.get(j);
					if (check <= min && check > 0 ) {
						min = check;
						if (count != 0) {
							hashContent.put(numbers.get(i), numbers.get(j));
						}
						count++;
					}
				}
			}
		}

		for (Map.Entry<Integer, Integer> entry : hashContent.entrySet()) {
			if(entry.getKey() < entry.getValue()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}else {
			System.out.println(entry.getValue() + " " +  entry.getKey());			
		}
			}
	}

	public static void main(String[] args) {
		List l = new ArrayList<Integer>();
		l.add(4);
		l.add(2);
		l.add(1);
		l.add(3);
		closestNumbers(l);
	}

}
