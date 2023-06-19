package problemSolving.CF.A;

import java.util.Scanner;

public class EvenOdds {
	
	public static long evenOddMethod() {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		long k = input.nextLong();
		long i,temp = 0,w=k;
	
		if(n/2 >= k) {
			i=1;
		}else {
			i=2;	
			if(n%2 ==0) {
			w=k-(n/2);
			}else {
				w=n-((n/2)+1);	
			}
		}
//		for(long j=0;j<w;j++) {
//			temp=i;
//			i+=2;
//		}
		
		if(i % 2 == 0) {
			temp=2*w;
		}else {
			temp=2*w-1;
		}
		
		return temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(evenOddMethod());
	}

}
