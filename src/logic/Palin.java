package logic;

public class Palin {
	public static void main(String[] args)
	{
		int onum=75757;
		int rnum=0;//75757
		     //75757   7>0  75757/10=7575.7=7575/10=757/10=75/10=7
		for(int i=onum;i>0;i=i/10)
		{
			//extarct last digit from orignal num and store it in a remindetr variable
			
			int rem=onum%10;//7%10=7
			//store that rem(last digit) in rnum
			rnum=rnum*10+rem;//7575*10+7=75757
		}
	}
	

}
