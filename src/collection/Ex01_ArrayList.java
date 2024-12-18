package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex01_ArrayList {
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();//here we are created the object of arraylist class
		a1.add("ashvaghosh");
		a1.add(101);
		a1.add(101);
		a1.add("ashvaghosh");
		a1.add("swapnil");
		
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.get(4));
		System.out.println(a1.contains("ashvaghosh"));
		System.out.println(a1.isEmpty());
		
	Iterator	s1=a1.iterator();
	while(s1.hasNext())
	{
		System.out.println(s1.next());
	}
		
		
		
		
		
	}

}
