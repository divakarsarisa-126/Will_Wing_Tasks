package Task_WW;

import java.util.Scanner;

public class Mirrorimage {

	public static String getImage (String originalstring) {
		StringBuffer bd=new StringBuffer(originalstring);
		StringBuffer db=bd.reverse();
		
		return originalstring+ " | "+ db;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Word: ");	
		
		String word = scan.next();
		System.out.println(getImage (word));		
	}
  }
