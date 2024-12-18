package Interface;

public class Inter9 implements Inter6 {

	public void add() {
		System.out.println("addtion running in inter9");
		
	}
	public static void main(String[] args) 
	{
		Inter9 i9=new Inter9();
		i9.add();
		Inter8 i8=new Inter8();
		i8.add();
		Inter7 i7=new Inter7();
		i7.add();
		
	}

}
