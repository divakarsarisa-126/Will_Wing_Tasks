package Monday_task;

import java.util.HashMap;
import java.util.Map;

public class Occurence_eachcharacter {

	public static void main(String[] args) {
		char [] charArr= {'A','E','R','O','P','L','A','N','E'};
		
		Map<Character, Integer> Charactercount = Countcharacter(charArr);
		
		System.out.println("Characters Count: " +Charactercount);
	}
	
	public static Map<Character, Integer> Countcharacter(char[] arr){
		
		Map<Character, Integer> charactercounMap = new HashMap<>();
		
		for(char ch:arr) {
			charactercounMap.put(ch, charactercounMap.getOrDefault(ch, 0)+1);
		}
		return charactercounMap;
		
	}
}
