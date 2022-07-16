package problemSolving;

import java.util.Scanner;

public class Magnets {

	public static int countMagnet() {
		int count = 0, temp = 0;
		Scanner input = new Scanner(System.in);
		int numberOfInputs = input.nextInt();
		input.nextLine();
		for (int i = 0; i < numberOfInputs; i++) {

			int enteryValue = input.nextInt();
			input.nextLine();
			if (temp != enteryValue) {
				count++;
			}
			temp =enteryValue;

		}
		return count;
	}

	public static void main(String[] args) throws Throwable {
		System.out.println(countMagnet());
	}

}
