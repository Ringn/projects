package string;

public class equals {
	public static void main(String[] args) 
	{
		String name1="ashvaghosh";
		String name2="ASHVAGHOSH";
		System.out.println(name1.equals(name2));
		System.out.println("------------");
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println("------------");
		System.out.println(name1.charAt(3));
		System.out.println("------------");
		System.out.println(name1.indexOf("v"));
		System.out.println("------------");
		System.out.println(name1.lastIndexOf("h"));
		
	}

}
