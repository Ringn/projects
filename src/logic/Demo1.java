package logic;

public class Demo1 {
	public static void main(String[] args) 
	{
		String s1="madam";
		String s2="";
		System.out.println(s1.length());
		
		for(int i=4;i>=0;i--)
		{
		    s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2))
		{
			System.out.println("string is palindrome");
		}
	}

}
