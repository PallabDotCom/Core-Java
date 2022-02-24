/*
 * Assuming that only when B1 is full, cars would be allowed to be parked in B2 and so on. 
 * The number of cars that can be parked in the basements B1, B2, B3, and B4 are N1, N2, N3, and N4. 
 * The total number of cars parked in the parking lot currently is N. 
 * The values of N1, N2, N3, N4, and N are displayed in the giant display board in the mall entrance. 
 * Help Tintu in quickly deciding where Raghav would have parked the car. 
 * For the negative inputs display the error "<Input> is not a valid input". 
 * If car count is greater than the sum of cars can be parked within 4 basements, 
 * then display "Parking slots in full"
 * Assume that no other car is in a queue to get parked and no other car leaves at this time.
 */
import java.util.Scanner;

public class CarParking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
	System.out.println("B1");	
	int B1=scan.nextInt();
		if (B1<0)
			System.out.println(B1+ " is not a valid input" );
		else
		{
			System.out.println("B2");
			int B2=scan.nextInt();
			if (B2<0)
				System.out.println(B2+ " is not a valid input" );
			else
			{
				System.out.println("B3");
				int B3=scan.nextInt();
				if (B3<0)
					System.out.println(B3+ " is not a valid input" );
				else
				{
					System.out.println("B4");
					int B4=scan.nextInt();
					if (B4<0)
						System.out.println(B4+ " is not a valid input" );
					else
					{
						System.out.println("Car count");
						int CarCount=scan.nextInt();
						if (CarCount<0)
							System.out.println(CarCount+ " is not a valid input" );
						else
						{
							int TotalParking=(B1+B2+B3+B4);
							if (CarCount>TotalParking)
								System.out.println("Parking slots in full"); 
							else
							{
								if (CarCount<=B1)
									System.out.println("The car can be parked at B1");
								else if (CarCount<=B1+B2)
									System.out.println("The car can be parked at B2");
								else if (CarCount<=B1+B2+B3)
									System.out.println("The car can be parked at B3");
								else if (CarCount<=TotalParking)
									System.out.println("The car can be parked at B4");
								
							}
							
						}
									
							
					}

				}

			}
			
		}

	}

}
