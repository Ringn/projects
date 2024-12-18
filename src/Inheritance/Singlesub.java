package Inheritance;

public class Singlesub extends Single 
{
	public void m2() 
	{
		int b=100;
		System.out.println(b);
		
	}
	public static void main(String[] args)
	{
		Singlesub s1=new Singlesub();
		s1.m2();
		s1.name();
		
	}

}
