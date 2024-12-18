package Poly;

public class overloading {
	//when we declare more than two methods with same name but diffrent parameter
	//then it is called as method overloading
	//method overloading is a type of polymorphism
	//also called as early binding
	//inheritance not require
	
	public void n1(int a) 
	{
		System.out.println(a);
		
	}
	public void n1(int a,int b ) 
	{
		System.out.println(a+b);
	}
	public void n1(int a,int b,int c) 
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args)
	{
		overloading o1=new overloading();
		o1.n1(20);
		o1.n1(40, 40);
		o1.n1(40,30,30);
	}

}
