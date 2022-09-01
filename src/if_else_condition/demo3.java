package if_else_condition;

import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("enter the number");
		int num= reader.nextInt();
		 
	        if(num <35)
	        {
	        	System.out.println(num + "is a fail");
	        }
	        else if (num >=35 && num <=50)
	        {
	            System.out.println(num + " is pass");
	        }
	        else if (num >=50 && num <=60)
	        {
	            System.out.println(num + " is second class");
	        }
	        else if (num >=61 && num <=75)
	        {
	            System.out.println(num + " is first class");
	        }
	        else if (num > 75)
	        {
	            System.out.println(num + " is first class with distinction");
	        }
	}

}
