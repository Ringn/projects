package Array;

public class Array3 {
	public static void main(String[] args)
	{
		long[] ar=new long[5];
         
		ar[0]=7744838574l;
		ar[1]=44;
		ar[3]=83;
		ar[2]=89;
		ar[4]=90;
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("---------reverse------");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	}

}
