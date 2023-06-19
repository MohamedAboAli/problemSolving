package problemSolving.CF.A;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

public class IsYourHorseshoe {
	
	
	private static int getTotalHorseShoes() {
		Scanner input=new Scanner(System.in);
		Integer[] valeraHorseShoes =Arrays.stream(input.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
		Set<Integer> s=new HashSet<Integer>(Arrays.asList(valeraHorseShoes));
		Optional<String> op=Optional.ofNullable("dd");
		return valeraHorseShoes.length-s.size();
	} 
	

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
System.out.println(getTotalHorseShoes());
Class cls= IsYourHorseshoe.class;
 Method m=cls.getMethod("getTotalHorseShoes", null);

	}

}
