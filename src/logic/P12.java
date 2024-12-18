package logic;

import string.length;

public class P12 {
public static void main(String[] args) 
{
	int count=0;
	String name=" as hva gh osh ";
	for(int i=0;i<=name.length()-1;i++)
	{
		char ch=name.charAt(i);
		if(ch=='h')
		{
			count++;
		}
	}
	System.out.println(count);
	
}

}
