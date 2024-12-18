package Abstrac;

public class Exam2 extends Exam1 {
 public void m2()
	{
		System.out.println("method m2 completed in exam2(concrete class)");
	}
	public static void main(String[] args) 
	{
		Exam2 e2=new Exam2();
		e2.m1();
		e2.m2();
	}

}
