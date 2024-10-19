package DiwaliSprint;

import java.util.LinkedHashSet;

   public class ModifyString_userchoice {

    public static String changeString(String str, char ch) {
        switch (ch) {
            case 'A':
            	
                return str + str;

            case 'B':
            	
                StringBuilder sbB = new StringBuilder(str);  
                for (int i = 1; i < sbB.length(); i += 2) {
                    sbB.setCharAt(i, '*');
                }
                return sbB.toString();

            case 'C':

                StringBuilder sbC = new StringBuilder();
                LinkedHashSet<Character> set = new LinkedHashSet<>();
                for (char c : str.toCharArray()) {
                    if (set.add(c)) {
                        sbC.append(c);
                    }
                }
                return sbC.toString();

            case 'D':

                StringBuilder sbD = new StringBuilder(str.toLowerCase());
                for (int i = 0; i < sbD.length(); i += 2) {
                    sbD.setCharAt(i, Character.toUpperCase(sbD.charAt(i)));
                }
                return sbD.toString();

            default: 
                return "Invalid Option";
        }
    }

    public static void main(String[] args) {
        String str = "hello world";
        char choice = 'B'; 
        
        String result = changeString(str, choice);
        System.out.println("Result: " + result);
    }
}
