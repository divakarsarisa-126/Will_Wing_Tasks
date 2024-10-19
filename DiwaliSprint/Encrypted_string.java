package DiwaliSprint;

public class Encrypted_string {
	
	public static String encryptString(String word) {
		StringBuilder encrypted = new StringBuilder();
		for(int i=0;i<word.length(); i++) {
			char c=word.charAt(i);
			char newchar=(char) (c+9);
			
			if(newchar>'Z') {
				newchar=(char) ('a'+( newchar -'z' -1));	
			}
	       encrypted.append(newchar);
		}
		
		return encrypted.toString();
		
	}
	
	public static void main(String[] args) {
		
		String word ="abcz";
		String encryString=encryptString(word);
		
		System.out.println(encryString);
	}

}
