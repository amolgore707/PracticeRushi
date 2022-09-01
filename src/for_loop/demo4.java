package for_loop;

public class demo4 {
	public void abc()
	{
		int a=12,b=14,c=10;
		
		if ((a>b)&&(a>c))
		{
			System.out.println("a is a big number");
		}
		else if (b>c)
		{
			System.out.println("b is a big number");
		}
		else
		{
			System.out.println("c is a big number");
		}
	}
	public void xyz()
	{
		int abc[]= new int[5];
		abc[0]=10;
		abc[1]=20;
		abc[2]=30;
		abc[3]=40;
		abc[4]=50;
		System.out.println(abc.length);
		
		for(int i=abc.length-1;i>=0;i--)
		{
			System.out.println(abc[i]);
		}
		
	}
//	public void pqr()
//	{
//		String ab[]= {"selenium","pom","cocumber","testNG"};
//		
//		{
//			for (int j=ab.length-1;j<=0;j++)
//			{
//				System.out.println(ab.length);
//			}
//		}
//		
//		
//	}

	public static void main(String[] args) {
		
		demo4 obj =new demo4();
		obj.abc();
		obj.xyz();
	
	
		}

	}


