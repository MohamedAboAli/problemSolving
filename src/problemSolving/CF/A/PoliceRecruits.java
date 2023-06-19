package problemSolving.CF.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PoliceRecruits {

	public static int getUntreatedCrimes() throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		int numberOFEvent = Integer.parseInt(input.readLine());
		
		String[] events = input.readLine().split(" ");
		int[] intarr = new int[numberOFEvent];
		for (int i = 0; i < events.length; i++)
			intarr[i] = Integer.parseInt(events[i]);

		int count = 0, recruit = 0;
		for (int i = 0; i < numberOFEvent; i++) {
			if (intarr[i] == -1 && recruit == 0) {
				count++;
			}else if(intarr[i] == -1 && recruit != 0) {
				recruit--;
			}else {
				recruit+=intarr[i];
			}

		}
		return count;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println(getUntreatedCrimes());
	}

}
