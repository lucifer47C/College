import java.util.*;
public class Exp2_q5
{
	public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the no. of subjects   :  ");
			int n = sc.nextInt();		

			int marks[] = new int[n];
			for(int i =0; i < n ; i++)			
				{
					System.out.print("Enter a number  :  ");
					marks[i] = sc.nextInt();
				}

			for(int i = 0; i <= n-2; i++)		
				{										
					for(int j = 0; j <= n-i-2; j++)
						{
							if(marks[j] > marks[j+1])
								{
									int temp = marks[j];
									marks[j] = marks[j+1];
									marks[j+1] = temp;
								}
						}
				}

			for(int i =0; i<n ; i++)	
				{
					if(marks[i] < 35)
						{
							System.out.println(marks[i] +" FAIL");	
						}		
					else if(marks[i] >= 35 && marks[i] <= 50)
						{
							System.out.println(marks[i] + " AVERAGE");
						}
					else if(marks[i] >= 51 && marks[i] <= 75)
						{
							System.out.println(marks[i] + " MERIT");
						}
					else
						{
							System.out.println(marks[i] + " DISTINCTION");
						}
				}
		}
}
