package StringOperations;

import java.util.Scanner;

public class RegexDemo {

	public static void main(String[] args) {
		
		String emailPattern = "^[a-z][a-z0-9+._-]+@[a-z]+\\.+[a-z]{2,7}$";
		char check;
		
		do {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter Email Id: ");
			String email = scan.nextLine();
			
			if( email.matches(emailPattern))
			{
				System.out.println("Valid email");
			}
			else
			{
				System.out.println("Invalid email");
			}
			System.out.println("Do you want to continue? (y/n): ");
			
			check = scan.next().charAt(0);
		}while(check != 'n');
		
		

	}

}
