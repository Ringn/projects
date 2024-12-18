
public class Cons3 {
	int num1;
	int num2;
	
	Cons3(int a, int b)
	{
		num1=a;
		num2=b;
	}
	public void add() 
	{
		System.out.println(num1+num2);
	}
	public void sub() 
	{
		System.out.println(num1-num2);
	}  
	public static void main(String[] args)
	{
		Cons3 c3=new Cons3(100,50);
		c3.add();
		c3.sub();
		
	}

}
