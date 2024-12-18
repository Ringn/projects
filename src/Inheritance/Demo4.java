package Inheritance;

public class Demo4 extends Demo3 {
	public void m3()
	{
		System.out.println("laptop");
		
	}
	public static void main(String[] args)
	{
		Demo4 d4=new Demo4();
		d4.m1();
		d4.m2();
		d4.m3();
	}

}
