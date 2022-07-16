package problemSolving;

import java.util.Scanner;

public class StonesontheTable {

	public static int countStone() {
		Scanner input = new Scanner(System.in);
		int stoneNumbers = input.nextInt();
		input.nextLine();
		int count = 0;
		String s = input.nextLine();
		for (int i = 0; i < stoneNumbers-1 ; i++) {
			if(s.length() >1) {
			if (s.charAt(i) == s.charAt(i+1)) {
				count++;
			}}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countStone());
	}

}
