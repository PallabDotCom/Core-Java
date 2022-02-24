/*
Tom went to a movie with his friends in a multiplex theatre and during break time he bought pizzas, 
puffs, and cool drinks. Consider   the following prices : 
Rs.100/pizza
Rs.20/puffs
Rs.10/cooldrink
Generate a bill for What Tom has bought.
 */
import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
			int PricePerPizza= 100;
			int PricePerPuffs= 20;
			int PricePercooldrink=10;
			
			System.out.println("Enter the no of pizzas bought");
			int noOfPizzas=scan.nextInt();
			System.out.println("Enter the no of puffs bought");
			int noOfPuffs=scan.nextInt();
			System.out.println("Enter the no of cool drinks bought");
			int noOfCoolDrinks=scan.nextInt();
			
			System.out.println("Bill Details");
			System.out.println("No of pizzas");
			System.out.println(noOfPizzas);
			System.out.println("No of puffs");
			System.out.println(noOfPuffs);
			System.out.println("No of cool drinks");
			System.out.println(noOfCoolDrinks);
			System.out.println("Total price");
			int TotalPrice = ((PricePerPizza*noOfPizzas)+(PricePerPuffs*noOfPuffs)+(PricePercooldrink*noOfCoolDrinks));
			System.out.println (TotalPrice);
			System.out.println("ENJOY THE SHOW!!!");
	}

}
