package all;
//print 1 to 10

public class array {
	
	public String abc(int a ,int b ,int c)
	{
		if((a>b)&&(a>c))
		{
			return "a is a big number" ;
		}
		else if (b>c)
		{
			return "b is a big number" ;
		}
		else
		{
			return "c is a big number" ;
		}
	

	}
		

	public static void main(String[] args) {
		array obj =new array();
		String f =obj.abc(12 , 25 , 8 );
		System.out.println(f);
	

	

	
		
		

	}

}
