import java.util.Scanner;

/*
Write a program to calculate the fuel consumption of your vehicle.The program should ask the user to enter 
the quantity of petrol to fill up the tank and the distance covered till the tank goes dry.Calculate the 
fuel consumption and display it in the format (liters per 100 kilometers).

Convert the same result to the U.S. style of miles per gallon and display the result. 
If the quantity or distance is zero or negative display "<respective_input> is an Invalid Input".

[Note: 
The US approach of fuel consumption calculation (distance / fuel) is the inverse of the European approach 
(fuel / distance ).Also note that 1 kilometer is 0.6214 miles, and 1 liter is 0.2642 gallons.]
The result should be with two decimal place. To get two decimal place refer the below-mentioned print statement :
float cost=670.23;
System.out.printf("You need a sum of Rs.%.2f to cover the trip",cost);
 */
public class FuelConsumptionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the no of liters to fill the tank");
		int quantityOfPetrol=scan.nextInt();
		if (quantityOfPetrol<=0)
			System.out.println(quantityOfPetrol + " is an Invalid Input");
		else 
		{
			System.out.println("Enter the distance covered");
			int DistanceCovered=scan.nextInt();
			if (DistanceCovered<=0)
				System.out.println(DistanceCovered + " is an Invalid Input");
			else
			{
				double LitersPer100KM= ((double)quantityOfPetrol/DistanceCovered)*100;
				System.out.println("Liters/100KM");
				System.out.printf("%.2f \n",LitersPer100KM );
				
				double miles=DistanceCovered*0.6214;
				double gallons=quantityOfPetrol*0.2642;
				
				System.out.println("Miles/gallons");
				System.out.printf("%.2f", miles/gallons);

			}

		}

	}

}
