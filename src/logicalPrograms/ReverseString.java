package logicalPrograms;

public class ReverseString {
	//ashvaghosh is name my
	public static void main(String[] args) 
	{
		String s1="my name is ashvaghosh";
		
		
		String[] arr = s1.split(" ");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

}
