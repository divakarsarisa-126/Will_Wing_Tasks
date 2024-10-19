package DiwaliSprint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Valuesmap_Sorted {
	
	public static List<Integer> getValues(HashMap<Integer, Integer> inputNum) {
		List<Integer> myList=new ArrayList<>();
		
		for(int i:inputNum.keySet()) {
			myList.add(inputNum.get(i));
		}
		myList.sort(null);
		return myList;
		
	}
	public static void main(String[] args) {
		HashMap<Integer, Integer> mynum=new HashMap<Integer, Integer>();
		mynum.put(1, 100);
		mynum.put(2, 800);
		mynum.put(3, 300);
		mynum.put(4, 400);
		mynum.put(5, 500);
		
		System.out.println(getValues(mynum));
	}
  }
