package collection;

import java.util.ArrayList;

public class Example_Array_List02 {

	public static void main(String[] args) 
	{
		ArrayList arr=new ArrayList();//store heterogeneous data
		arr.add(101);
		arr.add("ashvaghosh");
		arr.add("ashvaghosh");//duplicate information can store
		arr.add(null);//can store null 
		arr.add(null);//multiple null values
		int count=0;
		String s2="ashvaghosh";
		for(int i=0;i<=arr.size()-1;i++)
		{
			Object s3=arr.get(i);
			if(s2.equals(s3))
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
}

