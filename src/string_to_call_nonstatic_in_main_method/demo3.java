package string_to_call_nonstatic_in_main_method;

public class demo3 {
public void abc()
{
	String a ="selenium";
	{
		for(int i=a.length()-1;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		 System.out.println("MMS");
		demo3 obj = new demo3();
		obj.abc();
		System.out.println("MME");

	}

}
