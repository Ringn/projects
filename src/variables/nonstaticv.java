package variables;

public class nonstaticv {

	int a=20;
	public static void main(String[] args) 
	{
		nonstaticv v1=new nonstaticv();
		v1.m1();
		m2();
		
	}
	public void m1()
	{
		System.out.println(a);
	}
	public static void m2() 
	{
		nonstaticv v1=new nonstaticv();
		System.out.println(v1.a);
	}
}
