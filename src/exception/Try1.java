package exception;

public class Try1 {
	public static void main(String[] args) 
	{
		int num1=20;
		int num2=0;
		int num3=0;
		//System.out.println(num3);//abnormal situation here 20/0 go into infinity
		//so if exception occured then excuation will stop at exception line
		//doesnt exicute next line of tge program
		//so for handling this abnormal situation we use try and catch block
		try
		{
			num3=num1/num2;
			System.out.println(num3);//in try block we give abnormal situation
		}
		catch(ArithmeticException e)//arithimaticexception is a class of lang pack e is a boj
		{
			
		}
		System.out.println("hello");
		System.out.println("how are you");
		
		
	}

}
