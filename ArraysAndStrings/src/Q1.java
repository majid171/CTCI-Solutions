/*
 Q1 : Implement an algorithm to check whether if a string has all unique characters. What if you can't use additional Data Structures?
 
 If I can't use additional data structures then I will have to iterate through the list starting from the character until end,
 will take O(n^2).
 */

public class Q1 {
	public static void main(String[] args){
		System.out.println(isUnique("he"));
	}


	public static boolean isUnique(String message){
		boolean temp[] = new boolean[128];
		
		for (int i = 0; i < message.length(); i++){
			int val = message.charAt(i);
			if (temp[val])
				return false;
			
			temp[val] = true;
		}
		return true;
	}
}
