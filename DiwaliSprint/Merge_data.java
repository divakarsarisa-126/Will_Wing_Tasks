package DiwaliSprint;

import java.util.ArrayList;

public class Merge_data {
	
	public static char[] mergeData(ArrayList<Character> arraylistfirst,ArrayList<Character> arraylistsecond) {
		char[] totalArray =new char[arraylistfirst.size()+arraylistsecond.size()];
		
		arraylistfirst.addAll(arraylistsecond);
		arraylistfirst.sort(null);
		
		for(int index=0;index<arraylistfirst.size();index++) {
			totalArray[index]=arraylistfirst.get(index);
		}
		
		
		return totalArray;
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<Character> arr1=new ArrayList<Character>();
		arr1.add('A');
		arr1.add('B');
		arr1.add('C');
		arr1.add('D');
		arr1.add('E');
		
		ArrayList<Character> arr2=new ArrayList<Character>();
		arr2.add('F');
		arr2.add('G');
		arr2.add('H');
		arr2.add('I');
		arr2.add('J');
	
		
		
		char[] totalArray=mergeData(arr1,arr2);
		for(char c:totalArray) {
			System.out.print(c);
			System.out.print(",");
		}
		
	
	}

}
