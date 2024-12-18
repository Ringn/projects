package Array;

public class twodi {
	public static void main(String[] args) 
	{
	int ar[][]= {{10,20,30},{40,70,50},{60,80,100}};
	System.out.println("----printing 2D array");
	for(int i=0;i<=2;i++)//outer for loop for rows
	{
	for(int j=0;j<=2;j++)//inner for loop for column
	{
		System.out.print(ar[i][j]+" ");
	}
	System.out.println();
	}
	}
	

}
