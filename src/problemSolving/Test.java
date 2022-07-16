package problemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Product{
	int settingId,comId,distibuterID,typeId;
}
//12345	13	40	47	20	m2f3
//12345	13	40	48	30	dpmdm
//12345	13	40	49	60	
//12345	13	20	49	60	
//12345	13	20	49	60	

public class Test {

	public static int ques1() {
		int start, end = 1;
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String[] stringArr = s.split(" ");
		int[] intArr = new int[2];
		for (int i = 0; i < stringArr.length; i++) {
			intArr[i] = Integer.parseInt(stringArr[i]);
		}
		for (int i = 0; i < intArr[0]; i++) {
			end *= 10;
		}
		start = end / 10;

		for (int i = start; i < end; i++) {
			if (i % intArr[1] == 0) {
				return i;
			}
		}
		return -1;
	}

	public static int ques2() {
		Scanner input = new Scanner(System.in);
		int c = 0, r = 0, count = 0;
		for (int i = 0; i < 5; i++) {
			String s = input.nextLine();
			String[] stringList = s.split(" ");
			for (int j = 0; j < stringList.length; j++) {
				if (Integer.parseInt(stringList[j]) == 1) {
					c = i;
					r = j;
				}

			}

		}

		if (c > 2) {
			count += c - 2;
		} else {
			count += 2 - c;
		}

		if (r > 2) {
			count += r - 2;
		} else {
			count += 2 - r;
		}

		return count;
	}
	
	
	
	public void samir(List<Product> l) {
	
		HashMap<String,Product> map=new HashMap<String, Product>();
		int count;
		for(int i=0;i<l.size();i++) {
			
			count =0;
			
			Product p=map.get(""+l.get(i).settingId+"_"+l.get(i).distibuterID);
			
			if(p != null ) {
				//12345_40 , {}
				//12345_20 ,
				map.put(""+l.get(i).settingId+"_"+l.get(i).distibuterID, l.get(i));
			}else if(l.get(i).typeId < p.typeId){
				map.put(""+l.get(i).settingId+"_"+l.get(i).distibuterID, l.get(i));					
			}
			
		}
		
	}
	
	
	
	
	public static void main(String[] arg) {
		
		// System.out.println(ques2());
		 
		 int Integer = 99;
		 String String = "A";
		 System.out.print(Integer);
		 System.out.print(String);
		 System.out.println();
		//System.out.println(ques1());
	}

}
