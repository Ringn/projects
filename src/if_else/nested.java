package if_else;

public class nested 
{
	public static void main(String[] args)
	{
		int marks=58;
		if(marks>=75) 
		{
			System.out.println("first class with distinction");
			
		}
		else if(marks>=60 & marks<=74)
		{
			System.out.println("pass with first class");
			
		}
		else if(marks>=35 & marks<=59)
		{
			System.out.println("pass with second class");
			
		}
		else
		{
			System.out.println("fail");
		}
		
	}

}
