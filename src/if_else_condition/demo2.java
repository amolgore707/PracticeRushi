package if_else_condition;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner reader = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = reader.nextInt();

	        if(num <=18)
	            System.out.println(num + " is child");
	        else
	            System.out.println(num + " is adult");

	}

}
