package logic;

public class Swapp_Two_Number {
	public static void main(String[] args)
	{
		int a=20;
		int b=30;
		System.out.println("--orignal--");
		System.out.println(a);
		System.out.println(b);
		a=a+b;//20+30=50
		b=a-b;//50-30=20//now the value of a become value of b
		a=a-b;//50-20=30//and b value become value of a
		System.out.println("--after swapping--");
		System.out.println(a);
		System.out.println(b);
		
	}

}
