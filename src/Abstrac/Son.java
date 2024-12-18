package Abstrac;

public class Son extends Father {
	public void m3() 
	{
		System.out.println("bike: honda");
	}
  public void m2()
  {
	  System.out.println("home: 3bhk");
  }
  public static void main(String[] args) 
  {
	Son s=new Son();
	s.m1();
	s.m2();
	s.m3();
	  
}

}
