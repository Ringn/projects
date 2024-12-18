package logic;

public class Dog implements Animal{

	public void bark() 
	{
		System.out.println("dog is barking");
		
	}
	public static void main(String[] args)
	{
		
		Dog a=new Dog();
		a.bark();
	}
	

}
