package DiwaliSprint;

import java.util.ArrayList;
import java.util.List;

public class Modifyelement_arraylist {
	
	public static List<String> modifyElement(List<String> arrayList , String element) {
		
		List<String> myelements=new ArrayList<String>();
		
		for(int i=0;i<arrayList.size();i++) {
			myelements.add(arrayList.get(i).toLowerCase());
			  
			
		}
		boolean contains = myelements.contains(element.toLowerCase());
		
		if(contains) {
			int indexOfContains = myelements.indexOf(element.toLowerCase());
			if(element.length()%2==0) {
				arrayList.remove(arrayList.get(indexOfContains));
				arrayList.add(indexOfContains,element.substring(0, element.length()/2));
			}
			else {
				arrayList.remove(arrayList.get(indexOfContains));
				arrayList.add(indexOfContains,element.substring(0, (element.length()/2 )+1));
			}
			
		}
		else {
			
		}
		return arrayList;
		
	}
	
	public static void main(String[] args) {
		
		List<String> arrayList=new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("carrot");
		arrayList.add("dragon");
		
		
		System.out.println(modifyElement(arrayList,"Dragon")); 
	}

}
