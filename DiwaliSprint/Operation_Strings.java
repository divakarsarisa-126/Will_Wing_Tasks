package DiwaliSprint;

import java.util.ArrayList;

public class Operation_Strings {

    public static ArrayList<String> modifyStrings(String S1, String S2) {
    	
        ArrayList<String> result = new ArrayList<>();
        
        StringBuilder altReplaced = new StringBuilder(S1);
        for (int i = 0; i < S1.length(); i += 2) {
            altReplaced.replace(i, i + 1, S2);
        }
        result.add(altReplaced.toString());

        int firstIndex = S1.indexOf(S2);
        int lastIndex = S1.lastIndexOf(S2);
        if (firstIndex != lastIndex) {
            StringBuilder replacedLast = new StringBuilder(S1);
            String reversedS2 = new StringBuilder(S2).reverse().toString();
            replacedLast.replace(lastIndex, lastIndex + S2.length(), reversedS2);
            result.add(replacedLast.toString());
        } else {
            result.add(S1 + S2);
        }
        if (firstIndex != -1 && firstIndex != lastIndex) {
            StringBuilder deletedFirst = new StringBuilder(S1);
            deletedFirst.delete(firstIndex, firstIndex + S2.length());
            result.add(deletedFirst.toString());
        } else {
            result.add(S1);
        }

        int half = S2.length() / 2;
        String firstHalf = S2.substring(0, (S2.length() % 2 == 0) ? half : half + 1);
        String secondHalf = S2.substring(half);
        result.add(firstHalf + S1 + secondHalf);

        StringBuilder maskedString = new StringBuilder(S1);
        for (int i = 0; i < S1.length(); i++) {
            if (S2.indexOf(S1.charAt(i)) != -1) {
                maskedString.setCharAt(i, '*');
            }
        }
        result.add(maskedString.toString());

        return result;
    }

    public static void main(String[] args) {
        String S1 = "JAVAJAVA";
        String S2 = "VA";

        ArrayList<String> result = modifyStrings(S1, S2);
        for (String str : result) {
            System.out.println(str);
        }
    }
}

