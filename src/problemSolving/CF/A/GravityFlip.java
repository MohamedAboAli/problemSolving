package problemSolving.CF.A;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class GravityFlip {

	public static void gravitySwitching() {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.nextLine();
		if (number != 0) {
			
			int[] intarr = new int[number];
			String[] arr=input.nextLine().split(" ");
			
			for (int i = 0; i < arr.length; i++)
				intarr[i] = Integer.parseInt(arr[i]);

			Arrays.sort(intarr);
			
			for(int i=0;i<intarr.length;i++) {
			System.out.print(intarr[i]);
			System.out.print(" ");}
		}

	}
	
	public static void main(String[] args) {
		gravitySwitching();	
	}
}
