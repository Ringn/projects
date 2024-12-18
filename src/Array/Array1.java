package Array;

public class Array1 {
	public static void main(String[] args)
	{
		//what is array:=array is a collection of same or homoginous data type
		//why to use variable:=1)arrays allow us to store and access large number of element using single name
		//2)no need of creating sperate variable is an advantage
		//3)memory management
		//starting index of array is 0
		//syntax:=datatype[] arrayobjectname=new datatype[size]
		String[] ar=new String[5];//declaration
		//initialization
		ar[0]="ashvaghosh";
		ar[1]="deepak";
		ar[2]="jaya";
		ar[3]="pratiksha";
		ar[4]="sadashiv";
		System.out.println(ar[0]);//printing single element in array
		System.out.println(ar.length);//finding length of array
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		
	}

}
