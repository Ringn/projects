package sample;

public class pattern {
	public static void main(String[] args) 
	{
		m1();
		
		
	}
	public static void m1()
	{
		int row,col;
		int n=6;
		for(row=0;row<n;row++)
		{
			for(col=0;col<n;col++)
			{ 
				if(row==0 || col==n-1)
				{
					System.out.print("*");
			
				}
				else 
				{
					System.out.print(" ");
		
				}
		}
			
			
			
		}
		
	}

}
