package problemSolving;

public class IsPossible {

	public static boolean possible(int a, int b,int c,int d) {
		if(a > c || b >d) {
			return false;
		}
		if(a == c && b == d) {
			return true;
		}
		
		return possible(a+b, b, c, d) || possible(a, a+b, c, d);
		
	}
	
	public static void main (String[] args) {
		System.out.println(possible(1,1,5,2)?"Yes":"No");
	}
}
