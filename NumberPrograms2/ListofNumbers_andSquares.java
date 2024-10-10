package Second_Day_Tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListofNumbers_andSquares {

    public static Map<Integer, Integer> getSquares(int[] numbers) {
        Map<Integer, Integer> squaresMap = new HashMap<>();

        for (int num : numbers) {
           squaresMap.put(num, num * num);
        }
        return squaresMap;
    }

    public static void main(String[] args) {
    	  Scanner scanner = new Scanner(System.in);

          System.out.print("Enter the number of elements: ");
          int n = scanner.nextInt();
    	  int[] numbers = new int[n];

          System.out.print("Enter the numbers:");
          for (int i = 0; i < n; i++) {
              numbers[i] = scanner.nextInt();
          }
        Map<Integer, Integer> result = getSquares(numbers);
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println("Number: " + entry.getKey() + ", Square: " + entry.getValue());
        }
      }
   }
