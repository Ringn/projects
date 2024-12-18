package variables;

public class variable1 {
	int s=40;
	public static void main(String[] args) 
	{
		variable1 v1=new variable1();
		System.out.println(v1.s);//non static variable call
		//from same class
		m1();
		vari2 v2=new vari2();
		System.out.println(v2.d);//from different class
		v1.m2();
		}
	public static void m1() 
	{
		variable1 v1=new variable1();
		vari2 v2=new vari2();
		System.out.println(v1.s);
		System.out.println(v2.d);
	}
	public void m2() 
	{
		System.out.println(s);
	}

}
