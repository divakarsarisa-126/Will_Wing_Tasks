package Task_WW;

import java.util.Scanner;

public class DifferenceSumSquares {
	  
     static int calculateDifference (int n) {
  	   	int sum=0;
  	   int squareoftheirsum = (n*(n+1)/2)*(n*(n+1)/2);
  	   
    	 while(n>0) {
    	   sum=sum+n*n;
  	 
           n--;
	  }
    	 return sum-squareoftheirsum;
     }
	 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Natural Numbers: ");	
		
		int n = scan.nextInt();
		System.out.println(calculateDifference (n));		
	}   
	   
}

