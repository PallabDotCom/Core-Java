
/*
 * Sandeep has a postpaid telecom connection. He wants to verify his generated bill by calculating the number of calls and the number of SMS he made. According to his tariff, the first hundred calls and the first hundred SMS are free for each month. Later, he will be charged with Rs. 1.5 per call and Rs. 0.5 per SMS. There is a standard monthly charge of Rs.150 for all plans. Help him by writing a Java program to calculate the bill amount according to his usage along with the service tax of 5.5%
Note:
If the number of calls or SMS is given as negative numbers, then print “<call/sms> is an invalid input” and terminate. 
Also, if the number of calls or SMS count is greater than 1000, print “<call/sms> exceeds the maximum limit” and terminate. 
Otherwise, print the calculated amount with 2 digit precision as given in sample data. 
Hint:
To get two decimal places refer the below-mentioned print statement:
float cost=420.5687;

 */
		
import java.util.*;

public class PostpaidBillCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double CallCharge = 0,SMSCharge=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of calls:");
		int NoOfCalls= scan.nextInt();
				
		if (NoOfCalls<0)
			System.out.println(NoOfCalls +" is an invalid input" );
		else
		{
			if (NoOfCalls>1000)
				System.out.println(NoOfCalls +" exceeds the maximum limit" );
			else
			{
			System.out.println("Enter the number of SMS:");
			int NoOfSMS= scan.nextInt();
			if (NoOfSMS<0)
				System.out.println(NoOfSMS +" is an invalid input" );
			else if (NoOfSMS>1000)
				System.out.println(NoOfSMS +" exceeds the maximum limit" );

				else
				{
					if (NoOfCalls<=100 && NoOfSMS<=100 )
					{
						CallCharge = 0;
						SMSCharge = 0;					
					}
					else if (NoOfCalls<=100 && NoOfSMS>100 )
					{
						CallCharge = 0;
						SMSCharge = (NoOfSMS-100)*0.5;	
					}
					else if (NoOfCalls>100 && NoOfSMS<=100 )
					{
						CallCharge = (NoOfCalls-100)*1.5;
						SMSCharge = 0;
					}
					else if (NoOfCalls>100 && NoOfSMS>100 )
					{
						CallCharge = (NoOfCalls-100)*1.5;
						SMSCharge = (NoOfSMS-100)*0.5;
					}
					int monthlyCharge=150; 
					double ServiceCharge = (CallCharge+SMSCharge+monthlyCharge)*5.5/100;
					double BillAmount = CallCharge+ SMSCharge+monthlyCharge+ ServiceCharge;
					System.out.printf("Amount to be paid is Rs.%.2f", BillAmount);
		 
				}
			}			
		}


	}

}
