import java.util.Scanner;

public class TriangleName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scan = new Scanner(System.in);
	
	int a = scan.nextInt();
	
	if (a <=0)
		System.out.println(a + " is an Invalid Length");
	else 
	{
		int b = scan.nextInt();
		if (b<=0)
			System.out.println(b + " is an Invalid Length");
		else
		{
			int c = scan.nextInt();
			if (c<=0)
				System.out.println(c + " is an Invalid Length");
			else
			{
				if (a==b && b==c)
					System.out.println(a +", "+b+", "+c+" are the sides of Equilateral Triangle");
				else if (a==b || b==c ||c==a)
					System.out.println(a +", "+b+", "+c+" are the sides of Isosceles Triangle");
				else if (a!=b && b!=c)
					System.out.println(a +", "+b+", "+c+" are the sides of Scalene Triangle");
				
			}
				
		}
				
	}
				
	

	}

}
