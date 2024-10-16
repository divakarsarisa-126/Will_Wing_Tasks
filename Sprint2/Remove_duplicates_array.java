package Monday_task;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Remove_duplicates_array {

    public static int[] modifyArray(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set.descendingSet()) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
    	  Scanner scanner = new Scanner(System.in);

          System.out.print("Enter the size of the array: ");
          int n = scanner.nextInt();
          int[] arr = new int[n];

          System.out.println("Enter the elements of the array:");
          for (int i = 0; i < n; i++) {
              arr[i] = scanner.nextInt();
          }

          int[] modifiedArr = modifyArray(arr);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Modified Array in descending order with no duplicates): " + Arrays.toString(modifiedArr));
    }
  }
