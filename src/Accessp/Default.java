package Accessp;

public class Default {
	//if you declare any member as default then we can use that member within that package
	int a=30;//default access specifier
	///there is no keywiord to reprsent default
	void m2()//default method
	{
		int b=50;
		System.out.println(b);
	}
public static void main(String[] args)
{
	Default d1=new Default();
	d1.m2();
}
}
