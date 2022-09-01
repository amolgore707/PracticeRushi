package string_to_call_nonstatic_in_main_method;

public class demo5 {
	
	public void m1()
	{
		System.out.println("mi method in demo5 class");
	}
	public void m2()
	{
		System.out.println("m2 methid in demo5 class");
	}
	public void m3()
	{
		System.out.println("m3 method in demo5 class");
	}
	
	

	public static void main(String[] args) {
		System.out.println("MMS");
		demo5  obj = new demo5 ();
		obj.m1();
		obj.m2();
		obj.m3();
		System.out.println("MME");
		

	}

}
