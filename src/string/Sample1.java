package string;

public class Sample1 {

	public static void main(String[] args)
	{
		//string is a non primitive datatype and size is not fixed
		//string is use to store multiple charecters
		//string is a also a inbuilt class in java.lang package
		//string class is bydefault final so we cant inherit the string class
		//object creation take place at the time of object creation & initialization
		//we can create object using two ways
		//1)without new kwyword 2)with new keyword
		//string objects are immutable in nature means we cant change the value of object
		//string object are strored in a heap area in string pool area
		//string pool area 1)constant 2)non constant
		String name="ashvaghosh";//object creation without new keyword
		System.out.println(name);
		System.out.println("----------------");
		String name1=new String("ashvaghosh");
		System.out.println(name1);
		
		String name2="ashvaghosh";
		System.out.println(name==name2);
		System.out.println("----------");
		name=name+"ringne";
		System.out.println(name);//adding info to existing object
		//***if we add info to name then first information is discared and name assign to next info
		
		
	}

	
}
