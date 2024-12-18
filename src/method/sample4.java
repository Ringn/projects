package method;

public class sample4
{
	public static void main(String[] args) {
		
		System.out.println("hiiiiii");
		sample4 s4=new sample4();
		s4.name1();//calling non static regular method from same class
		s4.name2();
		sample5 s5=new sample5();//calling non static regular method from different class
		s5.m7();
		}
	public void name1()
	{
		System.out.println("hello");
		
	}
	public void name2()
	{
		System.out.println("good afternoon");
	}

	
}
