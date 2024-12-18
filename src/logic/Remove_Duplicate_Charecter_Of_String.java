package logic;

public class Remove_Duplicate_Charecter_Of_String {
	
	public static void main(String[] args) 
	{
		String name="ashvaghosh";
		String result="";
		
		System.out.println(name.indexOf('a'));//if not prsent in string then return -1
		for(int i=0;i<=name.length()-1;i++)
		{
			char a=name.charAt(i);
			if(result.indexOf(a)==-1)//if charecter is not in result then add it
			{
				result=result+a;
			}
			
		}
		System.out.println(result);
		
		
	}

}
