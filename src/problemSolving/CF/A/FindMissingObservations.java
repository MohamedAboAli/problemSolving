package problemSolving;

public class FindMissingObservations {
	
	// https://leetcode.com/problems/find-missing-observations
	// F== n
	// M= mean
	public static int[] missingRolls(int[] A, int F, int M) {
		// Variable to store sum of M rolls
        int sumM = 0;
        // Variable to store sum of N rolls
        int sumN = 0;
        
        // find the sum of M rolls
        for(int a : A){
            sumM += a;
        }
        
        // total rolls * mean will given us total sum of all rolls
        // subtracting sum of M rolls from total sum will give us sum of N rolls
        sumN = (F + A.length) * M - sumM;
        
        // dividing sum of N rolls by N rolls will give us the minimum value of the dice
        // that can be added to the aray. Since dice value can be betwen 1 and 6
        // so, values <1 or >6 will make it impossible to find N rolls. Return empty array in that case.
        if(sumN /(float) F > 6 || sumN / F < 1){
            return new int[]{};
        }
        
        // initialize array with size as n rolls.        
        int[] arr = new int[F];
        
        // To find the dice value of each roll, just follow the same method that we used above.
        // divide sum of N rolls by n rolls, then add the value to the array.
        // Subtract the added value from total sum and then repeat the process.
        for(int i=0; i<F; i++){
           arr[i] = sumN / (F-i); 
            sumN -= arr[i];
        }
       
        return arr;
    
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,5,6};
		int[] arr1=missingRolls(arr,4,3);
		System.out.println(missingRolls(arr,4,2));

	}

}
