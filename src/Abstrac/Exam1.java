package Abstrac;

abstract public class Exam1 {
	//abstract=incomplete
	//concrete=complete
	//*we can't create the object of abstract class
	
	public void m1() 
	{
		int a,b;
		a=90;
		b=100;
		System.out.println(a);
		System.out.println(b);
	}
	abstract public void m2(); //we give abstract keyword in front of incomplete method
		
	
}
