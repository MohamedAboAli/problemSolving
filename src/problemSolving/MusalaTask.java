package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MusalaTask {

	  public static List<String> funWithAnagrams2(List<String> text) {
		  Map<String,Integer> map=new HashMap<String,Integer>();
		  for(int i=0;i<text.size();i++){
		      String s=text.get(i);
		     char[] chars =s.toCharArray();
		     Arrays.sort(chars);
		      String sorted = new String(chars);
		      if(!map.containsKey(sorted)){
		          map.put(sorted, 1);
		      }else{
		          Integer value=map.get(sorted);
		           map.put(sorted, ++value);
		      }
		  }
		         Map<String,Integer> map2 =map.entrySet().stream().filter(entry->entry.getValue()<2).collect(Collectors.toMap(x->x.getKey(),x-> x.getValue()));
		         List<String>l=map2.keySet().stream().collect(Collectors.toList());
		    return l;
		      }

	
	
	public static List<String> funWithAnagram(List<String> text) {

		Set<String> set = new HashSet<String>();
		Set<Integer> set1 = new HashSet<Integer>();

		for (int i = 0; i < text.size(); i++) {
			String s1 = text.get(i);
			char[] ArrayS1 = s1.toLowerCase().toCharArray();
			boolean status = false;
			for (int j = 0; j < text.size(); j++) {
				if (i != j && ( !set1.contains(j))) {
					String s2 = text.get(j);
					char[] ArrayS2 = s2.toLowerCase().toCharArray();
					Arrays.sort(ArrayS1);
					Arrays.sort(ArrayS2);
					status = Arrays.equals(ArrayS1, ArrayS2);
					if (status) {
						// set.add(text.get(i));
						set.add(text.get(j));
						set1.add(i);
						set1.add(j);

					}
				}

			}

		}
		text.removeAll(set);
Collections.sort(text);
		return text;

	}

	public static int maxstreck(int m, List<String> data) {
		int count = 0;

		for (String d : data) {
			int yletterCount = d.length() - d.replaceAll("Y", "").length();
			if (yletterCount == m) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("YNYY");
		l.add("YYYY");
		l.add("YYYY");
		l.add("YYNY");
		l.add("NYYN");
		List<String> l1 = new ArrayList<String>();
		l1.add("code");
		l1.add("aaagmnrs");
		l1.add("anagrams");
		l1.add("doce");

	
		// System.out.println(maxstreck(4, l));
		System.out.println(funWithAnagrams2(l1));

	}
}
