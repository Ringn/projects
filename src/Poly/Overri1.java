package Poly;

public class Overri1 extends Overriding {
	
	public void nam() 
	{
		System.out.println("bike: hero");
		
	}
	
	
	
	public void m1()//in sub class super class method wanr to override then use method overriding
	
	{
		System.out.println("car: suzuki");
		
	}
	public static void main(String[] args)
	{
		
		Overri1 r1=new Overri1();
		r1.m1();
		r1.nam();
	}

	
}
