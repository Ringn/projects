package string;

public class contain {
	public static void main(String[] args) 
	{
		String name="ashvaghosh is my name";
		System.out.println(name.contains("ashhvaghosh"));
		//contains() use to search specific word in a string
		System.out.println("---------");
		System.out.println(name.startsWith("ashvaghosh"));
		//startsWith() method use to use to find first word in a string
		System.out.println("------------");
		System.out.println(name.endsWith("name"));
		//endsWith() method use to use to find last word in a string
		System.out.println("------------");
		System.out.println(name.isEmpty());
	}

}
