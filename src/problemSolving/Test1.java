package problemSolving;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test1 {

	public static void generate(Queue<Integer> l) {
		for(int i=0;i<10;i++) {
			int sum =0;
		
			for(int e:l) {
				sum+=Math.abs(e);
			}
			
			System.out.println(l);
			l.poll();
			l.add(sum);
		}
		
	}
	

	public static void encrypt(int key,String s) {

		for(int i=0;i<s.length();i++) {
			int check=s.charAt(i);
			check+=key;
			char b = (char) check;
			System.out.print(b);
		}
	
		
	}
	
	public static void decrypt(int key,String s) {

		for(int i=0;i<s.length();i++) {
			int check=s.charAt(i);
			check-=key;
			char b = (char) check;
			System.out.print(b);
		}
	
		
	}
	
	
	public static void main(String[] args) {
		encrypt(1,"xyz");
		System.out.println("");
		decrypt(1,"yz{");
	}
	
}
