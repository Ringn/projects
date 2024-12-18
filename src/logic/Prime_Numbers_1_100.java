package logic;

public class Prime_Numbers_1_100 {
	public static void main(String[] args) 
	{
	int primeNum=0;
	
	for(int num=1;num<=100;num++)
	{
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			primeNum++;
			System.out.println(num);
		}
	}
	System.out.println("prime numbers:"+primeNum);
	
		
		
	}

}
