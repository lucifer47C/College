import java.util.*;
class PrintSeries
	{
		synchronized void even(int n)
			{
				for(int i = 0; i <= n; i++)
					{
						if(i % 2 == 0)
							{
								System.out.println(Thread.currentThread().getName() + ": Even numbers: " + i);
							}
					}
				System.out.println();

			}
		synchronized void odd(int n)
			{
				for(int i = 0; i <= n; i++)
					{
						if(i % 2 != 0)
							{
								System.out.println(Thread.currentThread().getName() + ": Odd numbers: " + i);
							}
					}
				System.out.println();

			}
		synchronized void fib(int n)
			{
				int n1 = 0, n2 = 1, n3, i;    
 				System.out.println(Thread.currentThread().getName() + ": "+ n1 +"\n" + Thread.currentThread().getName()+": "+ n2);
    
 				for(i = 2 ;i < n; ++i)  
 					{    
  						n3 = n1 + n2;   
  						System.out.println(Thread.currentThread().getName() + ": " + n3);    
  						n1 = n2;    
  						n2 = n3;    
 					}
				System.out.println();
    
			}	
	}
class Demo1 extends Thread
	{
		PrintSeries obj;
		int n;
		
		Demo1(PrintSeries obj, int n)
			{
				this.obj = obj;
				this.n = n;
			}

		public void run()
			{	
				if(Thread.currentThread().getName() ==  "Thread-1")
					{
						obj.even(n);
					}
				else
					{
						obj.odd(n);
					}	 				
			}
	}
class Demo2 implements Runnable
	{
		PrintSeries obj;
		int n;
		
		Demo2(PrintSeries obj, int n)
			{
				this.obj = obj;
				this.n = n;
			}

		public void run()
			{	
				obj.fib(n);			
			}
	}

public class Exp9_q1
	{
		public static void main(String args[])
			{
				Scanner sc = new Scanner(System.in);
				PrintSeries obj = new PrintSeries();
				
				System.out.print("Enter nth number for even series: ");
				int n = sc.nextInt();
				System.out.print("Enter nth number for odd series: "); 
				int m = sc.nextInt();
				System.out.print("Enter nth number for fibonacci series: ");  
				int y = sc.nextInt();
				System.out.println();

				Demo1 t1 = new Demo1(obj, n);
				Demo1 t2 = new Demo1(obj, m);

				Demo2 dobj = new Demo2(obj, y);
				Thread t3 = new Thread(dobj);

				t1.setName("Thread-1");
				t2.setName("Thread-2");
				t3.setName("Thread-3");

				t1.start();
				t2.start();
				t3.start();				


			}	
	}

