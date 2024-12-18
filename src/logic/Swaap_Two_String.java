package logic;

public class Swaap_Two_String {
	
	public static void main(String[] args) 
	{
		String name1="ashvaghosh";
		String name2="swapnil";
		//swap two string
		name1=name1+name2;//ashvaghoshswapnil
		name2=name1.substring(0,name1.length()-name2.length());//ashvaghosh
		name1=name1.substring(name2.length());//swapnil
		System.out.println(name1);
		System.out.println(name2);
		
	
	}

}
