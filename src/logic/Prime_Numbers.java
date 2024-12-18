package logic;

public class Prime_Numbers {
	public static void main(String[] args) 
	{
		//print 1 to 50 prime numbers
		int a=0;
		for(int i=1;i<=50;i++)
		{
			
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			
			if(count==2)
			{
				System.out.println(i);
				a++;
				
			}
			
		}
		System.out.println("there are prime numbers between 1 to 10"+a);
	}

}
