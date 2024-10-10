package Second_Day_Tasks;

import java.util.Scanner;

public class AcceptNumber_Modify {

    public static int  modifyNumber(int number) {
    
     String numStr = Integer.toString(number);

    StringBuilder modifiedNumber = new StringBuilder();

    for (int i = 0; i < numStr.length() - 1; i++) {
      int digitone = Character.getNumericValue(numStr.charAt(i));
      int digittwo = Character.getNumericValue(numStr.charAt(i + 1));

      int diff = Math.abs(digitone - digittwo);
        modifiedNumber.append(diff);
    }

    modifiedNumber.append(numStr.charAt(numStr.length() - 1));

    return Integer.parseInt(modifiedNumber.toString());
}

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
    	System.out.print("Enter Number: ");
        int n =scan.nextInt();
  
        int result = modifyNumber(n);
        System.out.println("Modified Number: " + result); 
    }
}
