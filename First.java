class A implements Runnable
{
	
	Thread t1;
	A()
	{
		t1=new Thread(this);
		t1.start();
	}
	
	
	public void run() {
		try{
		for(int i=0;i<=10;i++){
			System.out.println(i);
		Thread.sleep(100);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}	
}

class B implements Runnable
{
	
	Thread t2;
	B()
	{
		t2=new Thread(this);
		t2.start();
	}
	
	
	public void run() {
		try{
		for(int j=0;j<=10;j++)
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
}

public class First {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		A a1=new A();
		B b1=new B(); 
	 
		
	//	1 5 10
		
		//Thread.MIN_PRIORITY
		//Thread.NORM_PRIORITY
		//Thread.MAX_PRIORITY
		
	/*	Runnable r=new Runnable() {
			
			public void run() {
				
				try{
					for(int j=0;j<=10;j++)
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
		};		
		Thread t1=new Thread(r);
		t1.start();
		
	
		t1.setName("Parent");
		System.out.println(t1.getName());*/
		
		
		
		
	 
	 
	}
}
