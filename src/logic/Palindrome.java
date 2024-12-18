package logic;

public class Palindrome {
	public static void main(String[] args) 
	{
		
		int onum=1221;// want reverse 1221
		int rnum=0;//1221
                //1221	12>0	1221/10=122.1 so 122/10=12.2=12/10=1.2=1
		//122.1 not store in int vari only store 122
		for(int i=onum;i>0;i=i/10 )
		{
			//first we get the last digit from onum 
			//following logic 
			int rem=i%10;//1%10=1
			//--------------
			//then store that num into rnum
			//logic
			rnum=rnum*10+rem;//122*10+1=1221
			//then remove last digit from the orignal num
			//logic that we have given in the increment operater space
			
			
		}
		System.out.println(rnum);
		if(rnum==onum)
		{
			System.out.println("number palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}
		
		
	    
		
	}

}
