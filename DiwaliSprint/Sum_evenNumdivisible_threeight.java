package DiwaliSprint;

public class Sum_evenNumdivisible_threeight {

    public static int findSum(int num) {
       
        int totalSum = 0; 

        while (num > 0) {
            if (num % 2 == 0 && num % 3 == 0 && num % 8 == 0) {
                totalSum += num;
           
            }
            num--;
        }

        return totalSum; 
    }

    public static void main(String[] args) {
        int n = 24; 
        int result = findSum(n);
        System.out.println("The sum of the first " + n + " even numbers divisible by 3 and 8 is: " + result);
    }
}
