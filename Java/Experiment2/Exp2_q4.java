import java.util.Scanner;
public class Exp2_q4
{
	public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the no. of rows  :  ");
			int n = sc.nextInt();					
		
			for(int i = 0; i < n ; i++)				
				{
					for(int j = 0 ; j < i+1 ; j++)			
						{
							System.out.print("#");
						}
					System.out.println();
				}
		}
}
