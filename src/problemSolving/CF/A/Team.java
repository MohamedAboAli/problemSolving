package problemSolving.CF.A;


import java.util.Scanner;

public class Team {

	public static int contestSolve() {
		int solvedProblemCount = 0;
		Scanner input = new Scanner(System.in);
		

		int problemNumber = input.nextInt();
		input.nextLine();
		for (int i = 0; i < problemNumber; i++) {
			
			 String s=input.nextLine();
			 String[] strArr =s.split(" ");

			if (( Integer.parseInt(strArr[0])+  Integer.parseInt(strArr[1]) + Integer.parseInt(strArr[2]))>= 2) {
				solvedProblemCount++;

			}


		}
		return solvedProblemCount;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(contestSolve());

	}

}
