package problemSolving.CF.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Games {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Integer teamCount = Integer.parseInt(input.nextLine());
		List<Integer> home = new ArrayList<Integer>();
		List<Integer> guest = new ArrayList<Integer>();
		for (int i = 0; i < teamCount; i++) {
			String[] homeArr = input.nextLine().split(" ");
			home.add(Integer.parseInt(homeArr[0]));
			guest.add(Integer.parseInt(homeArr[1]));
		}

		int count = 0;
		for (int i = 0; i < home.size(); i++) {

			for (int j = 0; j < guest.size(); j++) {

				if (i != j && home.get(i) == guest.get(j)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
