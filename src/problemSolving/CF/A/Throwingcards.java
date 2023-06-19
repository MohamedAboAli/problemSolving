package problemSolving.CF.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Throwingcards {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		
		String[] events = input.readLine().split(", ");


		Integer[] intarr = new Integer[events.length];
		for (int i = 0; i < events.length; i++)
			intarr[i] = Integer.parseInt(events[i]);
		
		Queue<Integer> queue = new LinkedList<Integer>(Arrays.asList(intarr));  
		
		while(queue.size()>2) {
			queue.remove();
			queue.add(queue.remove());
		}
		System.out.println(queue.remove());
	}

}
