package Inheritance;

public class heirarsub extends heirarsuper {

	public void m2()
	{
		System.out.println("sup class");
	}
	public static void main(String[] args)
	{
	
		heirarsub h2=new heirarsub();
		h2.m1();
		
	}
}
