import java.util.Scanner;
public class Exp2_q1
{
	public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number: ");
			int a = sc.nextInt();

			System.out.println("Enter the second number: ");
			int b = sc.nextInt();

			System.out.println("Enter the third number: ");
			int c = sc.nextInt();

			if (a > b && a > c)
				{
					System.out.println("First is the biggest: " + a);
				}
			else if(b > c && b > a)
				{
					System.out.println("Second is the biggest: " + b);
				}
			else if(c > a && c > b)
				{
					System.out.println("Third is the biggest: " + c);
				}
			else
				{
					System.out.println("All are equal");
				}
		}
}