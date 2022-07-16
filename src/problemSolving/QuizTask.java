package problemSolving;

import java.util.ArrayList;
import java.util.List;

public class QuizTask {

	public static String solution(String S, int K) {
		List<String> weekArray = new ArrayList<String>();
		weekArray.add("Mon");
		weekArray.add("Tue");
		weekArray.add("Wed");
		weekArray.add("Thu");
		weekArray.add("Fri");
		weekArray.add("Sat");
		weekArray.add("Sun");

		int indexOfS = weekArray.indexOf(S);
		int weekDay = K % 7;
		return weekArray.get((weekDay+indexOfS)%7);

	}
	
	 enum Color
	    {
	        RED, GREEN, BLUE;
	    }

	
	public static void main(String[] args) {
		System.out.println(100>>1);	
		System.out.print("62728af9bde6695b57722699678ecdb1bb0869c572514fe989b8a687175a5436".length());
		//System.out.println(QuizTask.solution("Wed", 2));
	}
}
