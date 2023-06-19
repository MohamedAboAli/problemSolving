package problemSolving.CF.A;

import java.util.Scanner;

public class BuyaShovel {

	public static int buy() {
		Scanner input = new Scanner(System.in);
		double shovelPrice = input.nextInt();
		double reminder = input.nextInt();
		int shovelNumber = 0;
		double check=0.0;

		for (int i = 1; i <= 10; i++) {
			check = (((shovelPrice * i) - reminder) / 10);
			if ((check % 1) == 0  || ((((shovelPrice * i)) / 10) %1 == 0) ) {
				
				return i;
			}

		}
		return shovelNumber;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(buy());
		
	}

}
