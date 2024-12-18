package logic;

public class P6 {
	public static void main(String[] args) 
	{
		//*******
		//  *****
		//    ***
		//      *
		int star=7;
		int space=2;//6
       for(int i=1;i<=4;i++)//3
       {
    	   for(int j=1;j<=star;j++)
    	   {
    		   System.out.print("*");//*******
    		                         //  *****
    		                         //    ***
    	   }
    	   System.out.println();
    	   for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
    	   
    	   star=star-2;//7531
    	   space=space+2;
       }
		
	}

}
