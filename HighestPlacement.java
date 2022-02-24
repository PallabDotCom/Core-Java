/*
SRV college wants to recognize the department which has succeeded in getting the maximum number
of placements for this academic year. The departments that have participated in the recruitment
drive are CSE, ECE, MECH. Help the college find the department getting maximum placements.
Check for all the possible output given in the sample snapshot

Note: 
If any input is negative, the output should be "Input is invalid".
If all department has the equal number of placements, the output should be "None of the department 
has got the highest placement".
 */
import java.util.Scanner;

public class HighestPlacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the no of students placed in CSE");
		int CSE=scan.nextInt();
		System.out.println("Enter the no of students placed in ECE");
		int ECE=scan.nextInt();
		System.out.println("Enter the no of students placed in MECH");
		int MECH=scan.nextInt();
		
		if (CSE==ECE && ECE==MECH)
			{
				System.out.println("None of the department has got the highest placement");
			}
		else if (CSE<0 || ECE<0 || MECH<0 )
			{
				System.out.println("Input is invalid");
			}
		
		else if (CSE>ECE)
		{
			if (CSE>MECH)
			{
				System.out.println("Highest placement");
				System.out.println("CSE");
			}	
			else if (CSE==ECE)
			{
				System.out.println("Highest placement");
				System.out.println("CSE");
				System.out.println("ECE");
			}
			
			else if (CSE==MECH)
			{
				System.out.println("Highest placement");
				System.out.println("CSE");
				System.out.println("MECH");
			}				
			
		}	
		else if (ECE>MECH )
		{			
			if (ECE>CSE)
			{	
				System.out.println("Highest placement");
				System.out.println("ECE");
			}
			else if (CSE==ECE)
			{
				System.out.println("Highest placement");
				System.out.println("CSE");
				System.out.println("ECE");
			}
			
			else if (ECE==MECH)
			{
				System.out.println("Highest placement");
				System.out.println("ECE");
				System.out.println("MECH");
			}
			

		}	
		
		if (MECH>CSE)
		{
			
			if (MECH>ECE)
			{
				System.out.println("Highest placement");
				System.out.println("MECH");
			}
			else if (CSE==MECH)
			{
				System.out.println("Highest placement");
				System.out.println("CSE");
				System.out.println("MECH");
			}
			
			else if (ECE==MECH)
			{
				System.out.println("Highest placement");
				System.out.println("ECE");
				System.out.println("MECH");
			}

	}

}
}
