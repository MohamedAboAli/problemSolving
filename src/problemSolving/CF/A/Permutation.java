package problemSolving.CF.A;

import java.util.HashSet;
import java.util.Set;

public class Permutation {

	public static Set<String> allPermutation(String s){
		 Set<String> set=new HashSet<String>();
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++)	
			
				set.add(swapChar(s,i,j));
			
		}
		return set;
	}
	
	public static String swapChar(String s,int i,int j) {
		char[] charArr=s.toCharArray();
		char temp=charArr[i];
		charArr[i]=charArr[j];
		charArr[j]=temp;
		return String.valueOf(charArr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="ABC";
		 Set<String>set=allPermutation(s);
		System.out.println(set);
	}

}
