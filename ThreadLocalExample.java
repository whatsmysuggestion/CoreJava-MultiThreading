
public class ThreadLocalExample {

	private ThreadLocal <String>tt=new ThreadLocal<String>();
	
	
	public static void main(String[] args) {
		
		ThreadLocalExample tl=new ThreadLocalExample();
		tl.tt.set("100");
		
		System.out.println(tl.tt.get());
		
	}
}
