package logic;

public class P3 {
	public static void main(String[] args) 
	{
		//*****
		// ****
		// ****
		// ****
		//***** 
		for(int i=0;i<=4;i++)
		{
			if(i==0||i==4)
			{
				for(int j=0;j<=4;j++)
				{
					System.out.print("*");
				}
			}
			else
			{
				System.out.print(" ");
				for(int j=0;j<=3;j++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
