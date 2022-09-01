package method;


// call non static in main method with return type and zero argument;
public class Type3 {

	public int abc(int a ,int b)
	{
		return (a+b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Type3 obj = new Type3();
		int d = obj.abc( 25 , 75);
		System.out.println(d);
	}

}
