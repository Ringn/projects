package Array;

import java.util.Arrays;

public class Arraysorting {
	public static void main(String[] args) 
	{
		int[]ar={30,40,10,20,7,4,3,2,1};
		System.out.println("---printing orignal data----");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		Arrays.sort(ar);
		System.out.println("---printing acending order data----");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("---printing decending order data----");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
			
		}
		System.out.println("----minimum number-----");
		System.out.println(ar[0]);
		System.out.println("----maximum number-----");
		System.out.println(ar[ar.length-1]);
		
	}

}
