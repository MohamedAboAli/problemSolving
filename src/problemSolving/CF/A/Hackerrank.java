package problemSolving.CF.A;

import java.util.*;

public class Hackerrank {
	public static int largestCountValue(List<Integer> a) {
		// Write your code here
		int count = 0;
		if (a.size() > 2) {
			int n1 = 0;
			int n2 = 0;

			if (a.size() % 2 == 0) {
				n1 = a.size() / 2;
			} else {
				n1 = (a.size() / 2) + 1;
			}
			n2 = a.size() - n1;
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

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

//       Scanner in = new Scanner(System.in);
//       
//       int n = in.nextInt();
//       int count = 0;
//       
//       Map<Integer , Integer> teams = new HashMap<>();
//       
//       for(int i =0; i < n ; i++){
//          teams.put(in.nextInt(), in.nextInt());
//       }
//       Integer[] key = teams.keySet().toArray(new Integer[0]);
//       
//       Integer[] value = teams.values().toArray(new Integer[0]);
//       
//       
//       for(int i = 0 ; i<key.length ; i++){
//           for(int j = 0 ; j < value.length ; j++){
//         
//               if(i != j){
//                  if(key[i] == value[j]){
//                  count++ ;
//                  }
//               }
//               
//               
//           }
//       }
//       System.out.print(count);
//       
//      

		List<Integer> l = new ArrayList<Integer>();
		l.add(2);
		l.add(3);
		l.add(1);
		l.add(3);
		System.out.println(largestCountValue(l));

	}

}
