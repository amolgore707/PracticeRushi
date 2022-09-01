package if_else_condition;


public class whichIsLargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 int a = 50, b=1000, c= 40, d=400;
		if ((a>b)&&(a>c)&&(a>d))
		{
			System.out.println("A is a big nuber");
		}
		
		else if ((b>c)&&(b>d))
		{
			System.out.println("B is a big number");
		}
		else if (c>d)
		{
			System.out.println("C is a big number");
		}
		else
		{
			System.out.println("D is a big number");
		}
		

	}

}
