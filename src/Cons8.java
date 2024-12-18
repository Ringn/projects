
public class Cons8 {
	int rollno;
	String name;
	float per;
	char grade;
	
	Cons8(int r,String n,float p,char g)
	{
		rollno=r;
		name=n;
		per=p;
		grade=g;
	}
	public void details() 
	{
		System.out.println("my rool nuber is :"+rollno);
		System.out.println("my name is :"+name);
		System.out.println("my percentage is :"+per);
		System.out.println("my garde is :"+grade);


	}
	public static void main(String[] args)
	{
		 Cons8 c8=new Cons8(44,"aniket",93.54f,'A');
		 c8.details();
		 System.out.println("--------------------");
		 Cons8 c9=new Cons8(45,"praharsh",45.54f,'B');
		 c9.details();
	}

}
