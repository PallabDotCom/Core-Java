import java.util.Scanner;

public class PatternStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rowNumber = scan.nextInt();
		
	
		System.out.println("Square"); 
		
		for (int i=1;i<=rowNumber;i++)
		{
			for (int j=1;j<=rowNumber;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	
		System.out.println("Increasing Triangle Pattern"); //Just for output separation
		
		for (int i=1;i<=rowNumber;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		
		System.out.println("Decreasing Triangle Pattern"); //Just for output separation
		
		for (int i=1;i<=rowNumber;i++)
		{
			for (int j=i;j<=rowNumber;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		

		System.out.println("Right Sided Triangle"); //Just for output separation
		
		for (int i=1;i<=rowNumber;i++)
		{
			for (int j=i;j<=rowNumber;j++)
			{
				System.out.print("  ");
			}
			for (int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		

		System.out.println("left Sided Triangle"); //Just for output separation
		
	for (int i=1; i<=rowNumber;i++)
	{
		for (int j=1;j<=i;j++)
		{
			System.out.print("  ");
		}
		for (int k=i;k<=rowNumber;k++)
		{
			System.out.print("* ");
		}
			
		System.out.println();
	}
	

	System.out.println("Hill or Pyramid pattern"); //Just for output separation
	
	for (int i=1; i<=rowNumber;i++)
	{
		for (int j=i;j<=rowNumber;j++)
		{
			System.out.print("  ");
		}
		for (int k=1;k<=i;k++)
		{
			System.out.print("* ");
		}
		for (int l=1;l<i;l++)
		{
			System.out.print("* ");
		}
			
		System.out.println();
	}
	
System.out.println("Reverse Hill or Pyramid pattern"); //Just for output separation
	
	for (int i=1; i<=rowNumber;i++)
	{
		for (int j=1;j<=i;j++)
		{
			System.out.print("  ");
		}
		for (int k=i;k<=rowNumber;k++)
		{
			System.out.print("* ");
		}
		
		for (int l=i;l<rowNumber;l++)
		{
			System.out.print("* ");
		}
		
			
		System.out.println();
	}
	
System.out.println("Diamond pattern"); //Just for output separation
	
	for (int i=1; i<rowNumber;i++)
	{
		for (int j=i;j<=rowNumber;j++)
		{
			System.out.print("  ");
		}
		for (int k=1;k<=i;k++)
		{
			System.out.print("* ");
		}
		for (int l=1;l<i;l++)
		{
			System.out.print("* ");
		}
			
		System.out.println();
	}
	
	for (int i=1; i<=rowNumber;i++)
	{
		for (int j=1;j<=i;j++)
		{
			System.out.print("  ");
		}
		for (int k=i;k<=rowNumber;k++)
		{
			System.out.print("* ");
		}
		
		for (int l=i;l<rowNumber;l++)
		{
			System.out.print("* ");
		}
		
			
		System.out.println();
	}
		
	}

}
