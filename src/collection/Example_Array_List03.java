package collection;

import java.util.ArrayList;
import java.util.Iterator;


public class Example_Array_List03 {

	public static void main(String[] args) 
	{
		ArrayList arr=new ArrayList();//store heterogeneous data
		arr.add(101);
		arr.add("ashvaghosh");
		arr.add("ashvaghosh");//duplicate information can store
		arr.add(null);//can store null 
		arr.add(null);//multiple null values
		//order of insertion maintain 
		//data structure resizable
		
		//iterator is use to ierate our arraylist 
		Iterator itr=arr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
		
	}
}

