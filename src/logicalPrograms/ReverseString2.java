package logicalPrograms;

public class ReverseString2 {
	//ym eman si hsohgavhsa
	public static void main(String[] args) 
	{
		String s1="my name is ashvaghosh";
		
		
		String[] arr = s1.split(" ");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			String org = arr[i];//my
			
			for(int j=org.length()-1;j>=0;j--)
			{
				System.out.print(org.charAt(j));
			}
			System.out.print(" ");
		}
		
		
		
	}

}
