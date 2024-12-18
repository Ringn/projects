package casting;

public class Dog2 extends Animal1 {

	@Override
	public void sound() {
		System.out.println("hiiiiii");
		
	}
	public static void main(String[] args)
	{
		Animal a=new Dog();
		a.sound();
		
	}

}
