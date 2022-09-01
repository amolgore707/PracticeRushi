package string_to_call_nonstatic_in_main_method;

public class demo2 {
	
	//Non Static method without Return type and 0 arguments or 0 parameter
	
	public void xyz()
	{
		System.out.println("xyz method in demo 2 class");
	}
	
	

	public static void main(String[] args) {
	System.out.println("main method started");
		demo2 obj =new demo2();
		obj.xyz();
		System.out.println("main method ended");

	}

}
