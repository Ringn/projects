
public class Cons7 {
	String name1;
	String name2;
	 Cons7(String a,String b)
	 {
		 name1=a;
		 name2=b;
	 }
	 public void name1() 
	 {
		System.out.println("name1: "+ name1);
		System.out.println("name2: "+ name2);
	}

	 public static void main(String[] args) 
	 {
		Cons7 c7=new Cons7("deepak","ringne");
		 c7.name1();
	}
}
