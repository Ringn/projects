package logicalPrograms;

public class SubString {
	//Name 
	public static void main(String[] args)
	{
		String s1="my name is ashvaghosh";
		
		String[] arr = s1.split(" ");
	
		
		for(int i=0;i<=arr.length-1;i++)
		{
			String org = arr[i];
			
			String neworg = org.substring(0, 1).toUpperCase()+org.substring(1);
			
			System.out.print(neworg+" ");
		}
	}

}

