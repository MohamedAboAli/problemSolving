package problemSolving;

import java.util.TreeMap;

public class SortColors {

	public static void sort(int[] arr,int[] colorFrequencies) {
		TreeMap<Integer, Integer> map=new TreeMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				int value=map.get(arr[i]);
				
			map.put(arr[i], ++value);
		}else {
			map.put(arr[i], 1);	
		}
			}
		
		
		for(int j=0;j<colorFrequencies.length;j++) {
			if(map.containsKey(colorFrequencies[j])) {
				for(int i=0;i<map.get(colorFrequencies[j]);i++) {
					System.out.println(colorFrequencies[j]);
				}
			}
			
		}
//		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
//			
//			for(int i = 0;i< entry.getValue();i++) {
//				System.out.print(entry.getKey());
//			}
//		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 

		int arr[]= {2,0,2,1,1,0};
		int arr1[]= {2,0,1};
		sort(arr,arr1);
	}

}
