package problemSolving;

import java.util.Scanner;

public class BearandBigBrother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		String[] arr = reader.nextLine().split(" ");
		int[] intarr = new int[arr.length];

		for (int i = 0; i < arr.length; i++)
			intarr[i] = Integer.parseInt(arr[i]);
		
		
		int numberOFyears = 0;
		 
			 while(intarr[0] <= intarr[1] ) {
				 intarr[0] =intarr[0]*3;
				 intarr[1]=intarr[1]*2;
				 numberOFyears++;
			 }
			 
			 System.out.println(numberOFyears);
		
	}	
	

}
