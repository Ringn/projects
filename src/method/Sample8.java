package method;

public class Sample8 {
	public static void main(String[] args)
	{
		System.out.println("hello moto");
		Sample8 s8=new Sample8();
		s8.sub(500, 200);
		Sample9 s9=new Sample9();
		s9.division(40, 4);
		
	}
	
	public void sub(int a,int b) 
	{
		System.out.println("substraction of two numbers is: "+(a-b));
	}

}
