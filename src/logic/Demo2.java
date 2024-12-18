package logic;

public class Demo2 {
	public static void main(String[] args) 
	{
		//count vowels
		String s1="ashvaghosh";
		int count=0;
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c = s1.charAt(i);
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
