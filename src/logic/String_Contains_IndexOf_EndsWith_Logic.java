package logic;

public class String_Contains_IndexOf_EndsWith_Logic {
	public static void main(String[] args) 
	{
		String mail="ashvaghosh@gmail.com";
		
		if(mail.contains("@")&& mail.indexOf("@")!=0&& mail.endsWith(".com") )
		{
			System.out.println("valid email");
			
		}
		else
		{
			System.out.println("invalid email");
		}
		
	}

}
