package logic;

public class Greatest {
	public static void main(String[] args) 
	{
		int a=12;
		int b=26;
		int c=12;
		if(a>b & a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a & b>c)
		{
			System.out.println("b is greater");
			
		}
		else if(c>a & c>b)
		{
			System.out.println("c is greater");
			
		}
		else if(a==b & a==c|| b==a & b==c|| c==a & c==b)
		{
			System.out.println("all are equal");
			
		}
		
		
		
	}

}
