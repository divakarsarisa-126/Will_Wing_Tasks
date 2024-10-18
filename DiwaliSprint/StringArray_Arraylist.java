package DiwaliSprint;

import java.util.*;

   public class StringArray_Arraylist {

      public static String[] getArrayList(String[] elements) {
    	  
         List<String> stringList = new ArrayList<>(Arrays.asList(elements));
  
         Collections.sort(stringList);
        
       int midIndex = (stringList.size()/2) + (stringList.size()%2);
        
        for (int i = 0; i < midIndex; i++) {
            stringList.set(i, stringList.get(i).toUpperCase());
           }
        for (int i = midIndex; i < stringList.size(); i++) {
            stringList.set(i, stringList.get(i).toLowerCase());
         }
        
        return stringList.toArray(new String[0]);
       }

      public static void main(String[] args) {
    	  
        String[] elements = {"Ramarao", "subbarao", "venkatarao", "govindrao", "eswarrao", "gangarao", "suryarao"};
        
         String[] resultArray = getArrayList(elements);
        System.out.println("Modified Array: " + Arrays.toString(resultArray));
      }
    }  
