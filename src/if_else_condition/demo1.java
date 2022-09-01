package if_else_condition;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num=6;
//		if (num%2==0)
//		{
//			System.out.println(num +" is a even numer");
//		}
//		else 
//		{
//			System.out.println(num+" is a odd number");
//		}
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the numer ");
		float num =sc.nextFloat();
		
		if (num%2==0)
		{
			System.out.println("even");
		}
		else 
		{
			System.out.println("odd");
		}

	}

}
