package logic;

public class Demo4 {
	public static void main(String[] args)
	{
		String s1="ashvaghosh";
		String result="";
		int count=0;
		
		for(int i=0;i<=9;i++)
		{
			char c = s1.charAt(i);
			
			if(result.indexOf(c)==-1)
			{
				result=result+c;
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				{
					count++;
				}
			}
		}
		System.out.println(result);
		System.out.println(count);
		
	}

}
