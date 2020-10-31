public class ThreadGroupDemo implements Runnable{  
    public void run() {  
          System.out.println(Thread.currentThread().getName());  
    }  
   public static void main(String[] args) {  
      ThreadGroupDemo tobj = new ThreadGroupDemo();  
      
          ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");  
            
          Thread t1 = new Thread(tg1, tobj,"one");  
          t1.start();  
          Thread t2 = new Thread(tg1, tobj,"two");  
          t2.start();  
          Thread t3 = new Thread(tg1, tobj,"three");  
          t3.start();  
               
          System.out.println("Thread Group Name: "+tg1.getName());  
   
  
    }  
   }  