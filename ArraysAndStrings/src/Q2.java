/*
 Q2 : Given two strings, determine whether one is a permutation of the other.
 */

import java.util.Arrays;

public class Q2 {
	public static void main(String args[]){
		System.out.println(check("ABC", "ACB"));
	}

	public static boolean check(String a, String b){
		
		char tempa[] = a.toCharArray();
		char tempb[] = b.toCharArray();
		
		java.util.Arrays.sort(tempa);
		java.util.Arrays.sort(tempb);
		
		return new String(tempa).equals(new String(tempb));
	}
}
