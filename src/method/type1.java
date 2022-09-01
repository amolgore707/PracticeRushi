package method;

public class type1 {

	public void m1(int a , int b )
	{
		System.out.println("total of a and b = "+(a+b));
		m2("amol", 24);
		System.out.println("bye bye");
	}
	
	public void m2(String c , int d)
	{
		System.out.println(c+d);
		System.out.println("welcome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		type1 obj = new type1();
		obj.m1(45, 45);
		
		
	}

}
