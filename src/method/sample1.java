package method;

public class sample1 {
	public static void main(String[] args)//predefined method 
	{
		int a=75;
		int b=85;
		int c=a+b;
		System.out.println("addition of a+b is: "+c); 
		m1();               //calling regular static method
		
	}
	public static void m1()         //regular static method
	{
		String a="Ashvaghosh";
		System.out.println("my name is: "+a);
		int n=5,e,d;
		if(n/2==0)
		{
			System.out.println("the number is even");
		}
		else
		{
			System.out.println("the number is odd");
		}
		
		for(d=0;d<5;d++)
		{
			for(e=0;e<5;e++)
			{
				if(e==0 || e==n-1 || d==n-3 || d==0 || d==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	}

}
             
