package method;

public class sample2
{
	public static void main(String[] args)
	{
		String studentname="ashvaghosh";
		System.out.println("student name is: "+studentname);
		m1();//same class method calling regular static method
		Sample3.m2();//diff class method calling regular static metod
		
	}
	public static void m1() 
	{
		String sarname="Ringne";
		System.out.println("sarname is:"+sarname);
	}

}

