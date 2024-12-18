package logic;

public class String_First_letter_Uppercase {
	public static void main(String[] args)
	{
		String s1="my name is ashvaghosh";// convert into My Name Is Ashvaghosh
		String[] words=s1.split(" ");
		for(String word:words)
		{
				String converted=word.substring(0,1).toUpperCase()+word.substring(1);
				System.out.print(converted+" ");
		}
			
			
			
			
	}

}



