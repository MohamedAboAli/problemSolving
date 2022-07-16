package problemSolving;


import java.util.Scanner;

public class NightattheMuseum {

	public static int aa() {
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		int count = 0;
		for (int i = 0; i < name.length(); i++) {

			int startCharValue=Integer.valueOf(name.charAt(i));
			int endCharValue;

			if(i ==0) {
				endCharValue=Integer.valueOf('a');
			}else {
				endCharValue=Integer.valueOf(name.charAt(i-1));
			}
		
			int reminder;
			if(startCharValue >endCharValue) {
			 reminder=startCharValue % endCharValue;
			}else {
				 reminder=endCharValue % startCharValue;
			}
				if (reminder <=13) {
					
					count += reminder;
				} else {
					count += 26-reminder;
				}
			

		}


		return count;
	}

	public static void main(String[] args) {
		System.out.println(aa());
	}

}
