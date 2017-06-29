
public class Q6 {

	public static void main(String[] args) {
		
		System.out.println(compression("aabbbbccc"));

	}
	public static String compression(String str){
		String compressed = "";
		int count = 0;
		
		for(int i = 0; i < str.length(); i++){
			count++;
			if (i + 1 == str.length()){
				compressed += "" + str.charAt(i) + count;
				break;
			}
			if (str.charAt(i) != str.charAt(i+1)){
				compressed +=  "" + str.charAt(i) + count;
				count = 0;
			}
		
		}
		return compressed.length() == str.length() ? str : compressed;	
	}
}
