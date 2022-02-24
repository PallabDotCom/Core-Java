/*
 * Help Mr.Ben who is a programmer, in developing a registration form on console. 

Customers will not just input data, but also view the details once he/she finishes the registration. 
 */
import java.util.Scanner;

public class PrintCustomerDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name =input.nextLine(); 
		System.out.println("Enter age:");
		int Age = input.nextInt();
		
		System.out.println("Enter gender:");
		String Gender =input.next();
		
		input.nextLine();
		System.out.println("Hailing from:");
		String City =input.nextLine();

		
		System.out.println("Welcome, " + name );
		System.out.println("Age:"+ Age);
		System.out.println("Gender:"+ Gender);
		System.out.println("City:" + City);

		

	}

}
