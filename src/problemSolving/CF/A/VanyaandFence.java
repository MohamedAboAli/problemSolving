package problemSolving.CF.A;

import java.util.Scanner;

public class VanyaandFence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		String[] arr = reader.nextLine().split(" ");
		int[] intarr = new int[arr.length];

		for (int i = 0; i < arr.length; i++)
			intarr[i] = Integer.parseInt(arr[i]);
		// int[] arr = Console.ReadLine().Split(' ').Select(Int32.Parse).ToArray();
		int count = 0;

		String[] arr1=reader.nextLine().split(" ");
		int[] intarr1=new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++)
			 intarr1[i]=Integer.parseInt(arr1[i]);

		for (int i = 0; i < intarr[0]; i++) {

			if (intarr1[i] >= 1 && intarr1[i] <= 2 * intarr[1]) {
				if (intarr1[i] > intarr[1]) {
					count += 2;
				} else {
					count++;
				}

			}

		}

		System.out.println(count);

	}

}
