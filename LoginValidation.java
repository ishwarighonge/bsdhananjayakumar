package kumar;

import java.util.Scanner;

public class LoginValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uname, upass;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter username and passowrd");
		uname = s.next();
		upass = s.next();
		
		if(uname.equalsIgnoreCase("admin") && upass.equals("admin123")) {
			System.out.println("Valid User");	
		}else {
			System.out.println("Invalid User");
		}
	
		
	}

}
