package logic;

public class PalinDrome_Is {
	public static void main(String[] args) 
	{
		//madam is palindrome
		
		String s1="madam";
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			 s2=s2+s1.charAt(i);
			
			
		}
		System.out.println(s2);
		if(s1.equals(s2))
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("not");
		}
		
	}

}
