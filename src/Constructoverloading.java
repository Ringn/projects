
public class Constructoverloading {
	//when we have more than two constructar in a same class with different 
	//parameter is called constructer overloading
	Constructoverloading(int a)
	{
		System.out.println(a);
	}
	Constructoverloading(int a,int b)
	{
		System.out.println(a+b);
	}
	Constructoverloading(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) 
	{
		Constructoverloading c1=new Constructoverloading(9);
		Constructoverloading c2=new Constructoverloading(9,5);
		Constructoverloading c3=new Constructoverloading(9,5,7);
	}

}
