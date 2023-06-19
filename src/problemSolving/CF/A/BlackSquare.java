package problemSolving.CF.A;

import java.util.Scanner;

public class BlackSquare {

	public static int caloriesCalculation() {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		String[] stringArr = s.split(" ");
		int[] intArr=new int[stringArr.length];
		
		for (int i = 0; i < stringArr.length; i++) {
			intArr[i] = Integer.parseInt(stringArr[i]);
		}
		
		int caloriesCount=0;
		String s1 = input.nextLine();
		for(int i=0;i<s1.length();i++) {
			int x=Integer.parseInt(String.valueOf(s1.charAt(i)));
			caloriesCount+=intArr[x-1];
		}
		return caloriesCount;
	}
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(caloriesCalculation());
	}

}
