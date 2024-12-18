package logic;

public class Palindrome_String {
	public static void main(String[] args) 
	{
		String s1="madam";
		String s2="";//madam
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);//madam
		}
		System.out.println(s2);
		if(s1.equals(s2))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("no");
		}
		
	}

}
