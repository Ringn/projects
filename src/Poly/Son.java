package Poly;

public class Son extends Father {
	public void add(int a,int b)//father method is overrided 
	{
		System.out.println(a+b+a);
		
	}
	public void sunmethod(int a,int b, int c) 
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args)
	{
		Son s=new Son();
		s.add(40, 60);
		s.sunmethod(3, 4, 3);
	}

}
