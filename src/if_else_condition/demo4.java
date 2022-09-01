package if_else_condition;

import java.util.Scanner;

public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the basic salary");
		float salary= sc.nextInt();
		
		if (salary <=10000)
		{
			float HRA = 20/100f * salary  ;    
			float da = 80/100f * salary;
			float gross =salary + HRA + da;
			
			
		System.out.println("Gross salary : "  + gross);
		}
		else if (salary>=10001 && salary<20000)
		{
			float HRA =25/100f * salary;
			float da = 90/100f * salary;
			float gross =salary + HRA + da;
			
			
			System.out.println("Gross salary : "  + gross);
		}
		else if (salary>=20000)
		{
			float HRA = 30/100f * salary;
			float da = 95/100f * salary;
			float gross =salary + HRA + da ;
			
			
			System.out.println("Gross salary : "  + gross);
		}	
		}

}
