import java.util.*;
public class Exp2_q2
{
	public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			Exp2_q2 cal = new Exp2_q2();
			
			while(true)
				{
					System.out.println("*******************");
					System.out.println("Enter the choice");
					System.out.println("1 for addition");
					System.out.println("2 for subtraction");
					System.out.println("3 for multiplication");
					System.out.println("4 for division");
					System.out.println("5 for exit");

					int choice = sc.nextInt();

					switch(choice)
					{
						case 1:
							cal.add();
							break;
						case 2:
							cal.difference();
							break;
						case 3:
							cal.multiply();
							break;
						case 4:
							cal.divide();
							break;
						case 5:
							System.exit(0);
							break;
						default:
							System.out.println("Invalid choice");
							break;
					}
				}
		}
		
	void add()
		{
			Scanner add = new Scanner(System.in);
			System.out.println("Enter the first number: ");
			int a = add.nextInt();

			System.out.println("Enter the second number: ");
			int b = add.nextInt();
			
			System.out.println("Sum is: " + (a+b));
		}

	void difference()
		{
			Scanner sub = new Scanner(System.in);
			System.out.println("Enter the first number: ");
			int a = sub.nextInt();

			System.out.println("Enter the second number: ");
			int b = sub.nextInt();
			
			System.out.println("Difference is: " + (a-b));
		}	
	
	void multiply()
		{
			Scanner mul = new Scanner(System.in);
			System.out.println("Enter the first number: ");
			int a = mul.nextInt();

			System.out.println("Enter the second number: ");
			int b = mul.nextInt();
			
			System.out.println("Multiplication is: " + (a*b));
		}

	void divide()
		{
			Scanner div = new Scanner(System.in);
			System.out.println("Enter the first number: ");
			float a = div.nextFloat();

			System.out.println("Enter the second number: ");
			float b = div.nextFloat();
			
			System.out.println("Division is: " + (a/b));
		}
}
