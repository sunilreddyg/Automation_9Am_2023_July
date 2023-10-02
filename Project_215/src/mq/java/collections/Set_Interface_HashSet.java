package mq.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Interface_HashSet {

	public static void main(String[] args) {
		
		/*
		 * Set is a unoder collection of objects
		 * Set doesn't accept duplicate values
		 */
		
		Set<String> set=new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("one");
		set.add("four");
		set.add("five");
		
		//Remove object from collection
		set.remove("three");
		
		//Verify object contains at collection
		boolean flag1=set.contains("two");
		System.out.println("Object status is :--> "+flag1);
		
		//Get Object Count of Collection
		int Count=set.size();
		System.out.println("Count is :--> "+Count);
		
		//Clear all data from Collection
		//set.clear();
		
		//Verify Collection is empty
		boolean flag=set.isEmpty();
		System.out.println("Collection Empty ?--"+flag);
		
		//Read First iterator value from collection
		String itr=set.iterator().next();
		System.out.println("First iterator value is :-> "+itr);
		
		
		//Reading all objects from collection using foreach loop
		for (String string : set) 
		{
			System.out.println(string);
		}
		
		
		//Using While loop read collection data
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext())
		{
			String read=iterator.next();
			System.out.println(read);
		}
		
	}

}
