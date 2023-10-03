package mq.java.collections;

import java.util.HashMap;
import java.util.Map;

public class Map_HashMap 
{

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		
		//adding object to map
		map.put(100, "Samsung");
		map.put(101, "Iphone");
		map.put(null, "Oneplus");
		map.put(103, "Oppo");
		map.put(104, null);
		map.put(105, null);
		
		
		
		
		//Read Single Pair object Using Key 
		String Phone=map.get(103);
		System.out.println(Phone);
		
		//Using Keyset reading all values
		for (Integer key: map.keySet()) 
		{
			String Eachvalue=map.get(key);
			System.out.println(Eachvalue);
		}
		

	}

}
