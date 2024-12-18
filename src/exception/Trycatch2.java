package exception;

public class Trycatch2 {
	public static void main(String[] args) 
	{
		int[] ar= {20,10,30,40};
		try
		{
			System.out.println(ar[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception handled successfully");
		}
		System.out.println("hello");
		
	}

}
