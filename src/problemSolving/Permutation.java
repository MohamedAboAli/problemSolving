package problemSolving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Permutation {

	public static Set<String> permute(String s) {
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++)

				set.add(swapChar(s, i, j));

		}
		return set;
	}

	public static String swapChar(String s, int i, int j) {
		char[] charArr = s.toCharArray();
		char temp = charArr[i];
		charArr[i] = charArr[j];
		charArr[j] = temp;
		return String.valueOf(charArr);
	}

	public static Set<Character> currentChars = new HashSet<Character>();

	public static Set<String> setString = new HashSet<String>();

	
	public static char[] result = new char[10];

	public static boolean[] checkArr = new boolean[10];

	private static void permuteWithRecursion(String str, int n, int j) {
		if (j == n) {
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i]);
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			result[j] = str.charAt(i);
			permuteWithRecursion(str, n, j + 1);
		}

	}

	private static void permute(String str, int n, int j,Set<String> s) {

		if (j == n) {
			s.add(String.valueOf(result));
//			for (int i = 0; i < result.length; i++) {
//				System.out.print(result[i]);
//			}
//			System.out.println();
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			if (checkArr[i] == false) {
				result[j] = str.charAt(i);
				checkArr[i] = true;
				permute(str, n, j + 1,s);
				checkArr[i] = false;
			}
		}
	}

	private static void permuteWithCheckALlAvaliablitiy(String str, int n, int j, String result) {
		if (j == n) {
			System.out.println(result);
			return;
		}
		permuteWithCheckALlAvaliablitiy(str, n, j + 1, result + str.charAt(j));
		permuteWithCheckALlAvaliablitiy(str, n, j + 1, result);
	}

	public static void purmuat(String s, int j) {

		if (s.length() == j) {
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i]);
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			if(checkArr[i]== false){
			result[j] = s.charAt(i);
			checkArr[i]= true;
			purmuat(s, j + 1);
			checkArr[i]= false;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ABC";
		Set<String> set = permute(s);
		System.out.println(set);
		permute(s,s.length(), 0,setString);
		// permuteWithCheckALlAvaliablitiy(s,s.length(),0,"");
		System.out.println(setString);
	}

}
