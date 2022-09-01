package string;

public class demo1 {
	
public void abc()
{
	System.out.println("abc is a method");
}
public void xyz()
{
	System.out.println("xyz is a method");
}

	public static void main(String[] args) {

		System.out.println("main method started");
		demo1 obj =new demo1();
		obj.abc();
		obj.xyz();
		System.out.println("main method ended");
	}
	}


