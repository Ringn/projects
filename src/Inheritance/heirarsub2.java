package Inheritance;

public class heirarsub2 extends heirarsuper  {
	public void m3() 
	{
		System.out.println("sub class ");
		
	}
	public static void main(String[] args)
	{
		heirarsub2 h1=new heirarsub2();
		h1.m1();
		//h1.m2();
		h1.m3();
		heirarsub h2=new heirarsub();
		h2.m2();
		
	}

}
