
public class Cons2 {
	int num1;
	int num2;
	Cons2()
	{
		num1=100;
		num2=50;
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
		Cons2 c2=new Cons2();
		c2.add();
		c2.sub();
		
		
	}
	

}
