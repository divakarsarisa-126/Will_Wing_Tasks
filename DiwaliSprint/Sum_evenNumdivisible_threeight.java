package DiwaliSprint;

public class Sum_evenNumdivisible_threeight {

    public static int findSum(int n) {
        int count = 0; 
        int num = 0;   
        int totalSum = 0; 

        while (count < n) {
            num++;
            if (num % 2 == 0 && num % 3 == 0 && num % 8 == 0) {
                totalSum += num;
                count++;
            }
        }

        return totalSum; 
    }

    public static void main(String[] args) {
        int n = 5; 
        int result = findSum(n);
        System.out.println("The sum of the first " + n + " even numbers divisible by 3 and 8 is: " + result);
    }
}
