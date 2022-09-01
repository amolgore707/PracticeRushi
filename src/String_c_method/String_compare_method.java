package String_c_method;

public class String_compare_method {
	
//	String comparison methods = 
//			1  equals()method
//			2  equalsIgnoreCase()method
//			3  compareTo()method
//			4  == operator

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "selenium";
		String b = "Selenium";
		String c = "SELENIUM";
		String d = "selenium";
		
		System.out.println(a.equals(b));         //false
		System.out.println(a.equals(c));           //f
		System.out.println(a.equals(d));           //t
		
		System.out.println();
		
		System.out.println(a.equalsIgnoreCase(b));      // t
		System.out.println(a.equalsIgnoreCase(c));       // t 
		System.out.println(a.equalsIgnoreCase(d));    // t
		
		System.out.println();
		
		System.out.println(a.compareTo(b));  //32
		System.out.println(a.compareTo(c));    //32
		System.out.println(a.compareTo(d));   //0
		
		System.out.println();
 		
		System.out.println(a==b);           // f
		System.out.println(a==c);        //f       
		System.out.println(a==d);        // t

	}

}
