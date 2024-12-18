package variables;

public class gvariable {
 static int a=20;
public static void main(String[] args)
{
	System.out.println(a);
	m1();
	gvariable g1=new gvariable();
	g1.m2();
}
public static void m1() 
{
	System.out.println(a);
	
}
public void m2()
{
	System.out.println(a);
}
}
