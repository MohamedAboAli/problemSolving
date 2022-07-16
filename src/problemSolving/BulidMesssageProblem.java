package problemSolving;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class BulidMesssageProblem {

	public static void rebuildMessage(String[] parts) {
		Map<Character,String> l=new TreeMap<Character,String>();
		for(int i=0;i<parts.length;i++) {
			if(parts[i].startsWith("A")) {
				l.put('A', parts[i]);
			}else if(parts[i].endsWith("Z")){
				l.put('Z', parts[i]);
			}else {
				if (parts[i].charAt(0) > 'A' )
				{
					l.put(parts[i].charAt(0), parts[i]);	
				}
				else if(parts[i].charAt(parts[i].length()-1) < 'Z') {
					l.put(parts[i].charAt(parts[i].length()-1), parts[i]);	
				}
			}
		}
	
		Collection values = l.values();
		System.out.println("All the values of TreeMap....");
		System.out.println(values);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"*=====#","X-+-+-+-+-+-+-Z","#___________X","A..........*"};
		rebuildMessage(s);
	}

}
