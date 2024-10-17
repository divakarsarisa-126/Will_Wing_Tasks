package DiwaliSprint;

public class SumCubes_ofdigitNumber {
	
	public static int findSum(int num) {
		
		  int sum = 0;
	    
	        while (num > 0) {
	            int digit = num % 10;  
	            sum += Math.pow(digit, 3); 
	            num /= 10;  
	        }
	        
	        return sum;
	    }
	
	  public static void main(String[] args) {
		  int num = 1234;
	        int result = findSum(num);
	        System.out.println("The sum of cubes of the digits is: " + result);
		
	}

}
