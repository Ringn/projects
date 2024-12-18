package casting;

public class Dog extends Animal
{
	public void sound() 
	{
		System.out.println("dog is barking");
		
	}
	public static void main(String[] args) 
	{
		//Animal a=new Dog();
		Dog a=new Dog();
		a.sound();
	}
	
}




