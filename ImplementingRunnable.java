
class A1 implements Runnable {

	/*
	 * Thread t1;
	 * 
	 * 
	 * A1() { t1 = new Thread(this);
	 * 
	 * 
	 * // t1.setPriority(10); t1.setName("First Thread");
	 * 
	 * 
	 * t1.start();
	 * 
	 * }
	 */
	 

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				Thread.sleep(100);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class B1 implements Runnable {

	Thread t2;

	B1() {

		t2 = new Thread(this);
		t2.start();

	}

	public void run() {
		try {
			for (int j = 0; j < 10; j++) {
				System.out.println(j);
				Thread.sleep(100);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class ImplementingRunnable {

	public static void main(String[] args) {

		A1 aa = new A1();

		
		
		  Thread t1=new Thread(aa,"First Thread");
		  t1.start();
		 

		/*
		 * 
		 * 
		 * t1.setPriority(10); System.out.println(t1.getPriority());
		 */

		// t1.setName("First Thread"); System.out.println(t1.getName());

		B1 bb = new B1();

		/*
		 * Thread t2=new Thread(bb); t2.start();
		 */

	}

}
