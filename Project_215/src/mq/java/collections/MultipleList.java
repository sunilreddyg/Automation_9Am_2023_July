package mq.java.collections;

import java.util.ArrayList;
import java.util.List;

public class MultipleList 
{

	public static void main(String[] args) {
		
		
		ArrayList<ArrayList<String>> listOLists = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> prodcut1 = new ArrayList<String>();
		prodcut1.add("iphone14");
		prodcut1.add("128GB");
		listOLists.add(prodcut1);

		ArrayList<String> product2 = new ArrayList<String>();
		product2.add("iphone15");
		product2.add("256GB");
		listOLists.add(product2);
		
		for (List<String>  EachProduct: listOLists) 
		{
				for (String string : EachProduct) 
				{
					System.out.println(string);
				}
			
		}
		

	}

}
