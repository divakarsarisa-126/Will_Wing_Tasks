package Monday_task;

import java.util.Arrays;

public class Reverse_number_sorting {

    public static void main(String[] args) {
        int[] arr = {13, 32, 46, 48, 52, 91};
        int[] sortedArr = getSorted(arr);
        
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Sorted array after reversing digits: " + Arrays.toString(sortedArr));
      }

    public static int[] getSorted(int[] arr) {
      int[] reversedArr = new int[arr.length];
        
      for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = reverseDigits(arr[i]);
     }
        
        Arrays.sort(reversedArr);
        return reversedArr;
    }

    private static int reverseDigits(int num) {
      int reversed = 0;
        
        while (num != 0) {
            int digit = num % 10; 
            reversed = reversed * 10 + digit; 
            num /= 10; 
      }
        
        return reversed;
    }
}
