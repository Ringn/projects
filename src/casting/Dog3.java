package casting;

public class Dog3 implements I1{

	public void name() {
		System.out.println("hiiiiii");
		
	}
	public static void main(String[] args) 
	{
		I1 a=new Dog3();
		a.name();
		
	}

}
