package problemSolving;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyorGirl {

	public static String checkGender() {
		Scanner input = new Scanner(System.in);
		String check = input.nextLine();
		int count = 0;
		Set<Character> s = new HashSet<Character>();
		for (int i = 0; i < check.length(); i++) {
			s.add(check.charAt(i));
		}

		if (s.size() % 2 == 0) {
			return "CHAT WITH HER!";
		} else {
			return "IGNORE HIM!";
		}

	}
	
	public static String checkGender2() {
		Scanner input = new Scanner(System.in);
		String check = input.nextLine();
		String temp="";
		
		for (int i = 0; i < check.length(); i++) {
			if(!temp.contains(String.valueOf(check.charAt(i)) ) ) {
				temp+=check.charAt(i);
			}else 
				continue;
		}

		if (temp.length() % 2 == 0) {
			return "CHAT WITH HER!";
		} else {
			return "IGNORE HIM!";
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(checkGender());
	}

}
