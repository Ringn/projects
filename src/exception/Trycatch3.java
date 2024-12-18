package exception;

public class Trycatch3 {
	public static void main(String[] args)
	{
		String ar="ashvaghosh";
		try
		{
			System.out.println(ar.charAt(10));//riski code or abnormal situation
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("exception hanmdled successfuly");
		}
		System.out.println("ringne");
	}

}
