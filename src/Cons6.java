
public class Cons6 {
	int num1;
	String name;
	
	Cons6(int a, String b)
	{
		num1=a;
		name=b;
		
	}
	public void m1() 
	{
		System.out.println(num1+ " "+ name);
	}
	public static void main(String[] args)
	{
		Cons6 c6=new Cons6(32,"ashvaghosh");
		c6.m1();
		Cons6 c7=new Cons6(33,"Ringne");
		c7.m1();
		
	}
	
	

}
