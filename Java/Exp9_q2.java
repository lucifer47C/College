import java.util.*;

class Travel 
	{
		int available_seats = 5;
 
		synchronized void book(int seat)
			{			
				if(available_seats < seat)
					{    
						System.out.println(Thread.currentThread().getName() + " No. of seats to book: "+ seat); 
						System.out.println(Thread.currentThread().getName() + " No available seats");   
 						System.out.println(Thread.currentThread().getName() + " waiting for cacellation...");

						try
							{
								wait();
							}
						catch(Exception e)
							{
								e.printStackTrace();
							}    
					}  
  
				available_seats -= seat;    
				System.out.println(Thread.currentThread().getName() + " Booking Confirmed");  
				System.out.println("");   
			} 

		synchronized void cancel(int seat)
			{
				System.out.println(Thread.currentThread().getName() + " Going to cancel");    
				System.out.println(Thread.currentThread().getName() + " No. of seats to cancel: "+seat); 
				available_seats += seat;    
				System.out.println(Thread.currentThread().getName() + " Cancellation Completed... ");    
				notify();    
			}
	}

public class Exp9_q2
	{
		public static void main(String args[])
			{			
				Travel obj = new Travel();
				System.out.println("Number of available seats: " + obj.available_seats);
							
				Thread t1 = new Thread()
				{
					public void run()
						{
							obj.book(7);
						}
				};
				t1.start();

				Thread t2 = new Thread()
				{
					public void run()
						{							
							obj.cancel(3);
						}
				};
				t2.start();

			}	
	}