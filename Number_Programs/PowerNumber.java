package Task_WW;

import java.util.Scanner;

public class PowerNumber {
   static boolean checkNumber(int n) {
	while(n>2 && n%2==0) {
		n=n/2;
	 }
	if(n==2) {
	  return true;
	}
	else {
		return false;
	}
			
  }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Natural Numbers: ");	
		
		int n = scan.nextInt();
		System.out.println(checkNumber (n));		
	}
  }
