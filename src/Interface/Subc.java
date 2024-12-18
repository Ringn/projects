package Interface;

public class Subc implements I1,I2 
{

	public void m2()
	{
	System.out.println("hiiiiii");	
		
	}

	public void m1() 
	{
		System.out.println("how are you");
		
	}
	public static void main(String[] args)
	{
		Subc c=new Subc();
		c.m1();
		c.m2();
		
	}
	

}
