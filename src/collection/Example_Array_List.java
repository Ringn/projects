package collection;

import java.util.ArrayList;

public class Example_Array_List {

	public static void main(String[] args) 
	{
		ArrayList arr=new ArrayList();//store heterogeneous data
		arr.add(101);
		arr.add("ashvaghosh");
		arr.add("ashvaghosh");//duplicate information can store
		arr.add(null);//can store null 
		arr.add(null);//multiple null values
		
		System.out.println(arr.get(0));
		System.out.println("----------");
		
		for(Object s1:arr)
		{
			System.out.println(s1);
		}
		System.out.println("----------");
		
		for(int i=0;i<=arr.size()-1;i++)
		{
			System.out.println(arr.get(i));
		}
		System.out.println("-----------");
		for(int i=arr.size()-1;i>=0;i--)
		{
			System.out.println(arr.get(i));
		}
	}
}
