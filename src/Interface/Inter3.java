package Interface;

public class Inter3 implements Inter1,Inter2 
{

	public void m2() 
	{
		System.out.println("running m2");
		
	}

	public void m1() 
	{
		System.out.println("running m1");
	}
	public static void main(String[] args)
	{
		Inter3 i3=new Inter3();
		i3.m1();
		i3.m2();
	}

}
