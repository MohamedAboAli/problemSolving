package problemSolving.CF.A;

import java.util.Scanner;

public class PetyaandStrings {

	public static int compare() {
		Scanner input = new Scanner(System.in);
		String firstletter=input.nextLine();
		String secondletter=input.nextLine();
		
		for(int i=0;i<firstletter.length() ;i++) {
			firstletter=firstletter.toLowerCase();
			secondletter=secondletter.toLowerCase();
			
			if(firstletter.charAt(i) != secondletter.charAt(i)) {
				if((firstletter.charAt(i)-secondletter.charAt(i)) <0) {
				return -1;
				}else{
					return 1;
				}}
			
		}
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(compare());
	}

}
