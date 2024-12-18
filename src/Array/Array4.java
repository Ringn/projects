package Array;

import java.util.Arrays;

public class Array4 {
	public static void main(String[] args) 
	{
		int[] ar={20,30,10,15,40};
		//print in asending order
		Arrays.sort(ar);
		System.out.println("-----ascending order--------");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("-----decending order--------");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	}

}
