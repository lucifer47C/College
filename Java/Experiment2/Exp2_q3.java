class Exp2_q3
{
	public static void main(String args[])
		{
			int day = Integer.parseInt(args[0]);	
			int month = Integer.parseInt(args[1]);    
			int year = Integer.parseInt(args[2]);	
		
			int d;
			d = ((year-2000)*365) + (int)((year/4)-500);

			int a[] = {31, 28, 31, 30, 31, 30, 31 ,31, 30, 31, 30, 31};

			for(int i = 0 ; i < month-1; i++)
				{
					d += a[i];				
				}

			d +=day;					
			System.out.print("The no. of days is    :  " + d);
		}
} 
