package This;

public class Super2 extends Super1
{
	int a=55;
	public void m1()
	{
		int a=90;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);//if non static global variable name present in super class
		//is same as local variable then to call that non static variable in asub class
		//we use super keyword
		
	}
	public static void main(String[] args) {
		Super2 s2=new Super2();
		s2.m1();
	}

}
