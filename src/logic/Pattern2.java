package logic;

public class Pattern2 {
	public static void main(String[] args)
	{
		//****  ****
		//   *  *
		//   *  *
		//   ****
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(j==4||j==7|| i==1&&j<4||i==1&&j>7||i==4&&j==5||i==4&&j==6)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
		
	}

}
