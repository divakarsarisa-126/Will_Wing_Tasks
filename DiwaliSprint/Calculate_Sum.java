package DiwaliSprint;

  public class Calculate_Sum {

    public static int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int sumOfFactorial(int n) {
        int a = 0, b = 1, sum = 0;

        for (int i = 0; i < n; i++) {
            int fibo = (i == 0) ? a : (i == 1) ? b : a + b;
            if (i > 1) { 
                a = b;
                b = fibo;
            }

            sum += fact(fibo); 
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 4;
        int result = sumOfFactorial(n);
        System.out.print("The sum of factorials for the first " + n + " Fibonacci numbers is: " + result);
    }
}
