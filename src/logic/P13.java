package logic;

public class P13 {
	public static void main(String[] args) 
	{
		//print the odd numbers from one to 10;
		int count=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==1)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
