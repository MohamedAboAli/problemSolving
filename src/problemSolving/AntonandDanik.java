package problemSolving;

import java.util.Scanner;

public class AntonandDanik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int antonCount = 0, danikCount = 0;
		if (n > 0 && n <= 100000) {
			String s = input.nextLine();
			s = input.nextLine();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'A') {
					antonCount++;
				} else if (s.charAt(i) == 'D') {
					danikCount++;
				}

			}

		}
		if (antonCount > danikCount) {
			System.out.println("Anton");
		} else if (antonCount < danikCount) {
			System.out.println("Danik");
		}else {
			System.out.println("Friendship");
		}

	}

}
