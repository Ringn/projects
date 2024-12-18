package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector_Example {
	public static void main(String[] args) 
	{
		Vector v =new Vector();//initial capacity 10
		v.add(101);
		v.add("ashvaghosh");
		v.add("ashvaghosh");//duplicate data allow
		v.add(null);//store multiple null values
		v.add(null);//order of insertion maintain
		System.out.println(v);
		v.set(0,202);//update oth element
		v.add(2,"yash");//right shift operation
		v.remove(2);//left shift operation
		System.out.println("===========");
		
		System.out.println(v.capacity());//same methods present in arrylist
		System.out.println(v.contains("ashvaghosh"));
		System.out.println(v.isEmpty());
		System.out.println(v.size());
		System.out.println(v.get(0));
		System.out.println("==========");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("=========");
		
		//we can use enumeration cursor & iterator cursor
		
		System.out.println("===printing using for each lop===");
		for(Object s:v)
		{
			System.out.println(s);
		}
		System.out.println("===printing using iterator cursor===");
		
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("===printing using enumurator cursor===");
		
	Enumeration	s3=v.elements();
	while(s3.hasMoreElements())
	{
		System.out.println(s3.nextElement());
	}
		
		
		
		
		
		
		
		
		
		
		
	}
}
