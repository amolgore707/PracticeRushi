package method;

public class callNonStaticInStatic {
	public static void xyz()
	{
		z();
	String a = "selenium";
	
	for (int i =a.length()-1; i >= 0 ; i--)
	{
	System.out.print(a.charAt(i));
	}
	}
	public static void z()
	{
		System.out.println("z is in non static block");
	}
	public static void main(String[] args) {
		
//		callNonStaticInStatic obj = new callNonStaticInStatic();
//		obj.xyz();
		
		xyz();
	}

}
