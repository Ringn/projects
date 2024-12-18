package Interface;

public class Sub implements I1,I2
{
	public void m1()
	{
		System.out.println("hiiiii");
	}
	public void m2()
	{
		
	}
	public static void main(String[] args)
	{
		Sub s=new Sub();
		s.m1();
		s.m2();
		
	}

}
