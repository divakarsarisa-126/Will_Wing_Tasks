package DiwaliSprint;

//import java.util.List;
//import java.util.Map;
import java.util.*;

   public class Perfect_Couples {

     static List<String> checkPerfectCouple(Map<String, String> couplesmap) {
    	 
        List<String> perfectCoupleid = new ArrayList<>();
        
        for (Map.Entry<String, String> entry : couplesmap.entrySet()) {
            String id = entry.getKey();
            String[] names = entry.getValue().split("-");
            
            String husband = names[0].trim();
            String wife = names[1].trim();
            
   
            if (Anagrams(husband, wife)) {
            	perfectCoupleid.add(id); 
            }
        }
        
        return perfectCoupleid;
    }
    
    private static boolean Anagrams(String strone, String strtwo) {
        if (strone.length() != strtwo.length()) {
            return false;
        }
        
        char[] arr1 = strone.toCharArray();
        char[] arr2 = strtwo.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
    	
        Map<String, String> couples = new HashMap<>();
        couples.put("ID1", "BABA-ABBA");
        couples.put("ID2", "ANNA-NANA");
        couples.put("ID3", "KIRAN-NARIK");
        couples.put("ID4", "PAPER-RAPPE");

        List<String> perfectCoupleids = checkPerfectCouple(couples);
            System.out.println("Perfect Couple IDs: " + perfectCoupleids);
    }
  }
