package problemSolving;

import java.util.Scanner;

public class BeautifulMatrix {
	static int count = 0;

	public static int countMove() {
		
		int[] values = new int[2];
	
		Scanner input = new Scanner(System.in);
		
		for (int row = 0; row <= 4; row++) {
			String stringArr = input.nextLine();
			
			
				if(!stringArr.isEmpty()) {
				String[] arr=stringArr.split(" ");
				int[] intarr = new int[arr.length];

				for (int i = 0; i < arr.length; i++) 
					intarr[i] = Integer.parseInt(arr[i]);
				
				//input.nextLine();
					for(int k=0;k<intarr.length;k++) {
				if (intarr[k] > 0) {
					values[0] = row;
					values[1] = k;
					break;
				}
					}
			}
				
			

		}

	if(values[0]<2)

	{
		count += 2 - values[0];
	}else
	{
		count += values[0] - 2;
	}if(values[1]<2)
	{
		count += 2 - values[1];
	}else
	{
		count += values[1] - 2;
	}

	return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countMove());

	}
}
