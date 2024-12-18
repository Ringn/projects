package logic;

public class p1 {
	public static void main(String[] args) 
	{
		int star=3;
		int space=1;
		for(int i=1;i<=10;i++)
		{
			
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");//***
			                      //
			}
			System.out.println();
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			star--;
			space++;
			
		}
		
	}

}
//***
// **
//  *
