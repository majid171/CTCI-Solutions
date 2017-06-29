/*
 Q3 : Write a method to replace all spaces in a string with '%20'. You may assume that you are given the "real" size of the string
 */
public class Q3 {
	public static void main(String args[]){
		String str = "hello majid";
		System.out.println(replace(str));
	}

	public static String replace(String str){
		
		String rep = "";
		
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) != ' '){
				rep += str.charAt(i);
			}
			else{
				rep += "%20";
			}
			
		}

		return rep;
	}
}
