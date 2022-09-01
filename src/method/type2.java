package method;

public class type2 {
	
		public void login (String username , String password)
		{
			if ((username.equals("Admin"))&&(password.equals("admin123")))
			{
				System.out.println("test case is pass");
			}
			else
			{
				System.out.println("test case is fail");
			}
		}

	public static void main(String[] args) {
		

		type2 obj = new type2();
		obj.login("Admin", "admin123");
	}

}
