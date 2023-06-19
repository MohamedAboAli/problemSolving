package problemSolving.CF.A;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.pdfbox.debugger.ui.Tree;

public class SortAlogrithim {

	public static int sort(int[] arr) {

		int left = 0, right = 0, pos = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				left += i - pos;
				pos++;
			}
		}
		pos = arr.length - 1;
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] == 0) {
				right += pos - i;
				pos--;
			}
		}
		return Math.min(right, left);
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				arr[j] = key;
				j--;
			}
			arr[j + 1] = key;
			System.out.println(Arrays.toString(arr));

		}

	}

	public static void selectionSort(int arr[]) {
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> l1 = new LinkedList<String>();
		int[] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		bubbleSort(arr);
		// insertionSort(arr);
		// selectionSort(arr);
		// System.out.println(sort(arr));
		TreeMap<Integer, Integer> t = new TreeMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (t.containsKey(arr[i])) {
				int value = t.get(arr[i]);
				t.put(arr[i], ++value);
			} else {
				t.put(arr[i], 1);
			}
		}
		System.out.println(t);
	}

}
