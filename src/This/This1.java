package This;

public class This1 {
	//when we have same name of local and non static global variable
	//then for calling non static variable we use this keyword
	int a=60;//non static variable
	public void m1() 
	{
		int a=70;//local v
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args) 
	{
		This1 t1=new This1();
		t1.m1();
		
	}

}
