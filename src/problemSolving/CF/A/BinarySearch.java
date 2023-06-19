package problemSolving.CF.A;

public class BinarySearch {

	public static int binarySearchAlgo(int[] arr, int f, int l, int key) {
		int m = f+(l-f) / 2;

		if (key == arr[m]) {
			return m;
		}
		if (l <= f) {
			return -1;
		}

		if (key > arr[m]) {
			return binarySearchAlgo(arr, m+1, l, key);
		} else {
			return binarySearchAlgo(arr, f, m-1, key);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 2, 3, 4, 10, 40 ,100};
	        int n = arr.length-1;
	        int x = 10;
		System.out.println(binarySearchAlgo(arr,0,n,x));
	}

}
