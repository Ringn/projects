package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Link_List_Example {
	public static void main(String[] args) 
	{
		LinkedList L1 =new LinkedList();//no default capacity 
		L1.add(101);
		L1.add("ashvaghosh");
		L1.add("ashvaaghosh");//duplicate data allow
		L1.add(null);//store multiple null values
		L1.add(null);//order of insertion maintain
		System.out.println(L1);
		L1.set(0,202);//update oth element
		L1.add(2,"yash");//right shift operation
		L1.remove(2);//left shift operation
		System.out.println("===========");
		  //we can't find out capacity                       
		//System.out.println(L1.capacity());//same methods present in arrylist
		System.out.println(L1.contains("ashvaghosh"));
		System.out.println(L1.isEmpty());
		System.out.println(L1.size());
		System.out.println(L1.get(0));
		System.out.println("==========");
		for(int i=0;i<=L1.size()-1;i++)
		{
			System.out.println(L1.get(i));
		}
		System.out.println("=========");
		
		
		System.out.println("===printing using iterator cursor===");
		
		Iterator itr=L1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
			
		
	}
}
