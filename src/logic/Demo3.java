package logic;

public class Demo3 {
	public static void main(String[] args) 
	{
		String s1="ashvaghosh";
		String s2="";
		System.out.println(s1.length());
		
		for(int i=9;i>=0;i--)
		{
		    s2=s2+s1.charAt(i);
		}
		
		System.out.println(s2);
	}

}

