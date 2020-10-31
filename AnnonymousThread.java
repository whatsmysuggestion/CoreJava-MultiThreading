
public class AnnonymousThread {

	public static void main(String[] args) {
		Runnable r=new Runnable() {
			
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
		};
		Thread t=new Thread(r);
		t.start();
		
 
		t.setName("My First Thread");
		System.out.println(t.getName());
 
	
	}	

}
