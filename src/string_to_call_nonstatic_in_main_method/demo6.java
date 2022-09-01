package string_to_call_nonstatic_in_main_method;

public class demo6 {
	
	public void abc ()
	{
		String abc [] = {"selenium","TestNG", "pom","postmon"};
		{
			for(int i=abc.length-1;i>=0;i--)
				System.out.println(abc[i]);
		}
	}
	
	
	

	public static void main(String[] args) {
		demo6 obj =new demo6();
		obj.abc();

	}
}

