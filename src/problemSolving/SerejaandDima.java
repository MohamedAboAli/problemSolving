package problemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerejaandDima {

	public static String getSum() {
		int serejaSum = 0, dimaSum = 0;
		Scanner input = new Scanner(System.in);
		int cardCount = input.nextInt();
		input.nextLine();
		String[] s = input.nextLine().split(" ");
		List cardList = new ArrayList<Integer>();
		for (int i = 0; i < cardCount; i++) {
			cardList.add(Integer.parseInt(s[i]));
		}
		for (int i = 0; i < cardCount; i++) {
			Integer lastelement = (Integer) cardList.get(cardList.size() - 1);
			if ((Integer) cardList.get(0) > lastelement) {

				if(i % 2 == 0) {
					serejaSum+=(Integer)cardList.get(0);
				}else {
					dimaSum+=(Integer)cardList.get(0);
				}
				cardList.remove(0);
			}else {
				if(i % 2 == 0) {
					serejaSum+=lastelement;
				}else {
					dimaSum+=lastelement;
				}
				cardList.remove(cardList.size() - 1);
			}
		}
		String finalResult=""+serejaSum+" "+dimaSum;
return finalResult;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum());
	}

}
