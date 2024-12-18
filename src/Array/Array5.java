package Array;

import java.util.Arrays;

public class Array5 {
	public static void main(String[] args) 
	{
		int[] ar={20,30,10,15,40};
		Arrays.sort(ar);
		System.out.println("smallest: "+ar[0]);
		for(int i=ar.length-1;i>=0;i--)
		{
			
		}
		System.out.println("largest: "+ar[ar.length-1]);
}
}
