
public class Cons4 {

	int num1;
	int num2;
	
	Cons4(int a,int b)
	{
		num1=a;
		num2=b;
	
	}
	public void mul() 
	{
		System.out.println(num1*num2);
	}
	public void div() 
	{
		System.out.println(num1/num2);
	}
	public static void main(String[] args)
	{
		Cons4 c4=new Cons4(10,5);
		c4.mul();
		c4.div();
		System.out.println("----------------");
		Cons4 c5=new Cons4(20,5);
		c5.mul();
		c5.div();
		System.out.println("----------------");
		Cons4 c6=new Cons4(30,5);
		c6.mul();
		c6.div();
		System.out.println("----------------");
		Cons5 c7=new Cons5(300,500);
		c7.add();
	}
}
