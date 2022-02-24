/*
Mega Mart wants to provide a discount to its customers based on customer type and bill amount. 
The customer type can be identified by customer Id. The discount can be provided for bill amount greater
than or equal to 1000 rupees only. Help Mega Mart to automate the above process using a Java code. 
The customer Id, Customer Type and Discount Percentage are given in the table below. 

Customer Id  Customer Type  Discount Percentage

1 to 100  Bronze  15 
101 to 250 Silver 18
251 to 500 Gold  23
501 to 1000 Platinum 28
1001 and above  Diamond  32

Note:
The customer Id should be a positive value, otherwise print “<Customer Id> is not a valid Customer Id” 
and terminate.The bill amount must be a positive value, otherwise print “<Bill amount> is not a valid Bill 
Amount” and terminate If the bill amount is greater than or equal to 1000 provide discounts as per the 
customer type. Else print the bill amount without any discount.
The calculated output must be printed with exactly two-digit precision
To get two decimal places, refer the print statement mentioned below:
double piValue=3.1415926535;
System.out.printf("%.2f",piValue);
Please do not use System.exit(0) to terminate the application.
 */
import java.util.Scanner;

public class MegaMartDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the Customer Id");
  int CustomerID=scan.nextInt();
  if (CustomerID<=0)
  	{
	  System.out.println(CustomerID + " is not a valid Customer Id");
	 }
  else
  	{
	  System.out.println("Enter the Bill amount");
	  int BillAmount=scan.nextInt();

	  if(BillAmount<0)
		  System.out.println(BillAmount+ " is not a valid Bill Amount");
	  else
	  {
		if (BillAmount>0 && BillAmount<1000)
			{
			double TotalPrice=BillAmount;
			System.out.printf("Total Price is "+ "%.2f",TotalPrice);
			}
		
		else if (CustomerID>=1 && CustomerID<=100)
			{
				double TotalPrice=BillAmount*0.85;
				System.out.printf("Total Price is "+ "%.2f",TotalPrice);
			}
		else if (CustomerID>=101 && CustomerID<=250)
			{
				double TotalPrice=BillAmount*0.82;
				System.out.printf("Total Price is "+ "%.2f",TotalPrice);
			}
		else if (CustomerID>=251 && CustomerID<=500)
			{
				double TotalPrice=BillAmount*0.77;
				System.out.printf("Total Price is "+ "%.2f",TotalPrice);
			}
		else if (CustomerID>=501 && CustomerID<=1000)
			{
				double TotalPrice=BillAmount*0.72;
				System.out.printf("Total Price is "+ "%.2f",TotalPrice);
			}
		else if (CustomerID>=1001)
			{
				double TotalPrice=BillAmount*0.68;
				System.out.printf("Total Price is "+ "%.2f",TotalPrice);
			}
	  }

  	}
}
	
}
