package Task_WW;

import java.util.Scanner;

public class IncreasingNumber {

	static boolean checkNumber(int n) {
		String numbstr=Integer.toString(n);
		for(int i=1;i<numbstr.length()-1;i++) {
			if(numbstr.charAt(i)>=numbstr.charAt(i+1)) {
				return false;
			}
		}
		return true;
		
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");	
		
		int n = scan.nextInt();
		System.out.println(checkNumber (n));		
	}
}
