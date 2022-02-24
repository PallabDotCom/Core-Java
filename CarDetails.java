/*
 * Write a program to get details about a car and display it. 

Hint: Store the price in double. When displaying, display the price correct to 2 decimal places.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class CarDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		
        System.out.print("Enter the car name:");
        String carName = input.nextLine();
        System.out.print("Enter the car no:");
        int carNo = input.nextInt();
        System.out.print("Enter the price:");
        Double price = input.nextDouble();
        System.out.println("Car name:" + carName);
        System.out.println("Car no:" + carNo);
        System.out.println("Price:" + df.format(price) +" rs only");

	}

}
