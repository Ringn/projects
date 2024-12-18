package logic;
import java.util.Scanner;

public class hotel {
	
	public static void main(String[] args) 
	{
		System.out.println("------HOTEL MANAGEMENT SYSTEM--------");
		hotel h=new hotel();
		h.menu();
		
	}
	
	public void menu()
	{
		
		System.out.println("you want a menu card: press yes");
		Scanner sc=new Scanner(System.in);
		
		String m=sc.nextLine();
		String[] ar=new String[5];
		ar[0]="ROOMS";
		ar[1]="MESS";
		ar[2]="DJ";
		ar[3]="FOODS";
		ar[4]="MAGAZINE";
		if(m.equals("yes"))
		{
			System.out.println("In our Hotel following things are available");
			for(int i=0;i<=ar.length-1;i++)
			{
				System.out.println(ar[i]);
			}
		}
	    
		
		
				
	
		
	}
}
