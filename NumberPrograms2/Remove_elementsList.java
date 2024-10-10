package Second_Day_Tasks;

import java.util.ArrayList;
import java.util.List;

public class Remove_elementsList {
	
 public List<String> removeElements(List<String>List1,List<String>List2){
	 List1.retainAll(List2);
	 return new ArrayList<>(List1);
 }
 
 public static void main(String[] args) {
	List<String> List1 = new ArrayList<>();
	List<String> List2 = new ArrayList<>();
	
	List1.add("Brinjal");
	List1.add("Carrot");
	List1.add("Tomato");
	List1.add("Potato");
	
	
	List2.add("Carrot");
	List2.add("Potato");
	List2.add("Brinjal");
	List2.add("Tomato");
	List1.add("mirchi");

 Remove_elementsList List3 = new Remove_elementsList();
 List<String> result =List3.removeElements(List1, List2);
 
 System.out.println("Enter Elements:");
 for(String elements:result) {
	 System.out.println(elements);
 }
 }
}
