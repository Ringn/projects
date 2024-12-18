package Accessp;

public class Private1 {
	//if you declare  any member of class then the scope of that member remain 
	//only within the class we cant use that member outside the class
	private int a=60;
	private void m1() 
	{
		System.out.println("hiiiii");
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		Private1 p1=new Private1();
		p1.m1();
		
	}

}
