package casting;

public class Demo7 {
	public static void main(String[] args)
	{
		Demo5 d5=new Demo6();
		d5.add();
		d5.sub();
		//d5.mul();//we can only call the inherited method
		System.out.println("------------------------");
		Demo6 d6=new Demo6();
		d6.add();
		d6.sub();
		d6.mul();
	}

}
