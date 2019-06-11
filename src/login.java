import java.util.ArrayList;
import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		//Login, Create an Account, Logout(exit)
		String[] log = new String[3];
		
		log[0]  = "1: Login";
		log[1]  = "2: Create an Account";
		log[2]  = "3: Logout";
		
		System.out.println("Please select from the following options!");
		for (String opt : log) 
			System.out.println(opt);
		
		int input = scan.nextInt();

		if (input == 1) {
			System.out.println("Username: ");
			String username = scan.next();
			System.out.println("Password: ");
			String password = scan.next();
			System.out.println("Succefully login!!");
		}
		else if (input == 2) {
			System.out.println("Create an Account Option is selected!");
			System.out.println("Full Name: ");
			String name = scan.next();
			System.out.println("new UserName: ");
			String newusername = scan.next();
			System.out.println("Passowrd: ");
			String newpassword = scan.next();
			System.out.println("Your Account has been created!!");
		
		}
		else if (input == 3) {
			System.out.println("Logout Option is selected!");
			System.exit(0);
		}
		else 
			System.out.println("Please select from the avaliable options!!");
		
		scan.close();

	}

}
