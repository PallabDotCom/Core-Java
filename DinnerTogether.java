/*
 * Sam and Riya are fond of the "Delicious" restaurant. Sam will have his dinner in that restaurant on every 'i'th day. Riya will have her dinner on every 'j'th day. Find the day on which Sam and  Riya will have their dinner together in that restaurant. When a day is less than or equal to zero, then display "<'i'th> to <'j'th> is not a valid interval".

Hint: Find out the LCM for given inputs.
*/		
import java.util.Scanner;

public class DinnerTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the day interval of Sam");
		int a= scan.nextInt();
		System.out.println("Enter the day interval of Riya");
		int b= scan.nextInt();
		int GCD=1;
		
		if (a<=0 || b<=0)
			System.out.println(a + " to "+ b +" is not a valid interval");
		else
		{
			for(int i = 1; i <= a && i <= b; i++)   
			{  
			//divides both the numbers by i, if the remainder is 0 the number is completely divisible by i  
			//Checks that i is present in both or not  
			//returns true if both conditions are true  
			if(a % i == 0 && b % i == 0)  
			//assigns i into gcd  
			GCD = i;  
			}  
			//determines lcm of the given number  
			int LCM = (a * b) / GCD;  
			//prints the result  
			System.out.printf("Sam and Riya will have their dinner on day "+ LCM);  
		}  
		
	}
}

/*
Another logic for finding lcm of both numbers
 
//find the largest between two numbers x and y and assigns the large number to the variable a  
int a =(x > y)? x : y;  

for(int i = a ; i <= x*y ; i = i + a)  
{  
//returns true if both conditions are true  
if(i % x == 0 && i % y == 0)  
break;  
}  
//prints the result  
System.out.println("LCM of "+x+" and "+y+" is: "+i);  
}  
*/
