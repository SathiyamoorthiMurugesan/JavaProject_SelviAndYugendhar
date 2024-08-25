package collectionAndSets;

import java.util.*;
public class Setpractice {
	public static void main(String[] args) {
		HashMap<Integer,String> list1=new HashMap<Integer,String>();
		
		list1.put(1001, "Sathyamoorthi Murugasen");
		list1.put(1002,"Selvi Murugan");
		list1.put(1003,"Yugandhar V G");
		HashMap<Integer,String> list2=new HashMap<Integer,String>();
		list2.putAll(list1);
			
		Set<Integer> keys = list1.keySet();
		for(Integer each: keys) {
			System.out.println(each);
		}
		
		Collection<String> values = list2.values();
		for(String each: values) {
			System.out.println(each);
		}
		Iterator<Integer>  iterator1 = ((Set<Integer>) list1).iterator();
		
		if(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		
		
		
		
	}

}
