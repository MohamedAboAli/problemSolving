package problemSolving.CF.A;

import java.util.Scanner;

public class Word {

	public static String editString() {
		Scanner input =new Scanner(System.in);
		String word=input.nextLine();
		int lower=0,upper=0;
		for(int i=0;i<word.length();i++) {
			if(Character.isUpperCase(word.charAt(i))) {
				upper++;
			}else {
				lower++;
			}
			
		}
		
		if(lower>=upper) {
			
			return word.toLowerCase();
		}else {
			return word.toUpperCase();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(editString());
	}

}
