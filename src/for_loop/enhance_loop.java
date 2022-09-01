package for_loop;

public class enhance_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc[] = new String [7];
		 abc[0]="selenium";
		 abc[1]="java script executer ";
		 abc[2]="pom";
		 abc[3]="cocumber";
		 abc[4]="test NG";
		 abc[5]="Git hub";
		 abc[6]="Jenkins";
		 
		 for(String xyz : abc)
		 {
			 if (xyz.equals("Git hub"))
				 {
						 System.out.println("test case is pass " + xyz);
				 }
			 else 
			 {
				 System.out.println("test case is fail " + xyz);
			 }
			
		 }
		 

	
	}

}
