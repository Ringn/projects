package Array;

public class Array2 {
	public static void main(String[] args) 
	{
		String[] ar=new String[5];
		ar[0]="ashvaghosh";
		ar[1]="deepak";
		ar[2]="ringne";
		ar[3]="at";
		ar[4]="harsul";
		System.out.println("----------forward----------");
		for(int i=0;i<=ar.length-1;i++)//forward direction
		{
			System.out.println(ar[i]);
		}
		System.out.println("------------reverse-----------");
		for(int i=ar.length-1;i>=0;i--)//reverse direction
		{
			System.out.println(ar[i]);
		}
		
	}

}
