interface Addition
{
	void sum(int a,int b);
}


public class AnnyClassExample /* implements Addition */ { 
	
	
	/*
	 * public void sum(int a,int b) {
	 * 
	 * }
	 */
	
	void x()
	{	
		Addition aa=new Addition() {

			public void sum(int a, int b) {
			 
				System.out.println(a+b);
				
			}
		 
		};
		
		aa.sum(12,13);
		
		
	}
	
	void y()
	{
		
	}
	
	public static void main(String[] args) {
		
		AnnyClassExample aa=new AnnyClassExample();
		aa.x();
	
}
}