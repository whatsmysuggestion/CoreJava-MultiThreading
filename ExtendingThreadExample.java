class A11 extends Thread
{
	public void run() {
		
				try
				{
				for(int i=0;i<10;i++)
				{
					System.out.println(i);
				Thread.sleep(100);
				}		
				}
				catch(Exception e)
				{
					System.out.println(e);
				}		
	}
	
	
	
	
	/*
	 * 
	 * public void destroy() {
	 * 
	 * Thread t=Thread.currentThread();
	 * 
	 * t=null; }
	 */
	 
	 
	 
}
class B11 extends Thread
{
	public void run() {
		
		try
		{
			for(int j=0;j<10;j++)
			{
				System.out.println(j);
			Thread.sleep(100);
			}			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}		
				
		}
	
	/*
	 * public void destroy() { Thread t=Thread.currentThread(); t=null; }
	 */
}
public class ExtendingThreadExample {

	public static void main(String[] args) { 
	
		
		
			A11 a1=new A11();
		    a1.setPriority(10);
			System.out.println(a1.getPriority());
			a1.start();
			
		  a1.setName("First Thread");
		   System.out.println(a1.getName());
		 
		/*
		 *  
		 * a1.setPriority(5); System.out.println(a1.getPriority());
		 */
		/*
		 * 
		 * System.out.println(a1.getName()); 
		 * 
		 */
			
			//a1.run();
		/*
		 * 
		 * 
		 * 
		 * 
		 * System.out.println(a1.getName()); a1.setPriority(1);
		 * System.out.println("Priority---->"+a1.getPriority());
		 */
		 
			
			
		
		  
		/*
		 * Thread t1=new Thread(a1,"First Thread");
		 * 
		 * t1.start(); t1.setPriority(5); System.out.println(t1.getPriority());
		 */
		  
		 
		  
			B11 t2=new B11();
		//t2.run();
		t2.start(); 
		/*
		 * t2.setName("Second Thread"); System.out.println(t2.getName());
		 */
		/*
		 * 
		 */
		  
		/*
		 * 
		 * Thread t=Thread.currentThread(); System.out.println(t.getName());
		 * t.setName("Some Name"); System.out.println(t.getName());
		 */
		 
		  
		 
		
		/*
		 *  a1.start();
		 * 
		 * a1.setName("First Thread"); System.out.println(a1.getName());
		 */
		  
		  
		/*
		 * Thread t1=new Thread(a1,"First Thread");
		 * 
		 * System.out.println(t1.getName()); t1.setPriority(5);
		 * System.out.println(t1.getPriority()); t1.start();
		 */
			  
		
		
		
		/* 
		 * 
		 * a1.setPriority(10);
		 * 
		 * System.out.println(a1.getPriority());
		 */
		
											 
	
		
		//a1.run();
		
	
		/*
		 * t2.setPriority(5); System.out.println(t2.getPriority());
		 * t2.setName("Second Thread"); System.out.println(t2.getName());
		 */
		/*
		 *
		 * System.out.println(t2.getName());
		 */
		
		//t2.run();
		
		/*
		 * 
		 * 
		 * t.setName("First Thread"); System.out.println(t.getName());
		 */
		 
		
		/*
		 * A11 a1=new A11(); a1.start();
		 */
		/*
		 * Thread t=new Thread(a1,"First Thread"); t.start(); t.setPriority(1);
		 */
		
		/*
		 * a1.start();
		 * 
		 * a1.setName("First Thread"); System.out.println(a1.getName());
		 * a1.setPriority(1); System.out.println(a1.getPriority());
		 */
		
		
		/*
		 * System.out.println(a1.getName()); a1.setName("Sharmin");
		 * System.out.println(a1.getName());
		 */
		/*
		 *  a1.setPriority(1);
		 * System.out.println(a1.getPriority());
		 */
		
		//a1.start(); 
		//Thread t1=new Thread(a1,"Sharmin");  
		//t1.setPriority(Thread.MAX_PRIORITY);
	 	//t1.start();
		
	 	//System.out.println(t1.getName());
		/*
		 * Thread t1=new Thread(a1,"Sharmin"); t1.setName("First");
		 * System.out.println(t1.getName());
		 * 
		 * t1.setPriority(Thread.MIN_PRIORITY); System.out.println(t1.getPriority());
		 * 
		 * t1.start();
		 */
		  
		//a1.run();
		//t1.setName("Sharmin");
		//System.out.println(t1.getName()); 
		// a1.start();
	
	//a1.setPriority(Thread.MIN_PRIORITY);
	//System.out.println(a1.getPriority());
		
		/*
		 * a1.setName("A11 Thread"); System.out.println(a1.getName());
		 * a1.setPriority(1); System.out.println(a1.getPriority());
		 */
		
		

	 
		/*
		 * B11 t2=new B11(); // t2.setPriority(10); //t2.start();
		 * 
		 * t2.start();
		 */
		/*
		 * t2.setName("Second"); System.out.println(t2.getName()); t2.start();
		 */
		/*
		 * t2.setName("B11 Thread"); System.out.println(t2.getName());
		 */
		//t2.run();
		/*
		 * t2.setName("Keral"); System.out.println(t2.getName()); t1.setPriority(1);
		 * System.out.println(t1.getPriority());
		 */
		
		//1 or Thread.MIN_PRIORITY
		//5 or Thread.NORM_PRIORITY
		//10 or Thread.MAX_PRIORITY
		
	}

}
