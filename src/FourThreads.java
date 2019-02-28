
public class FourThreads implements Runnable {
	String threadName1;
	static int count=0;
		FourThreads(String thread)
		{
			this.threadName1=thread;
		}
		public void run()

		{
			System.out.println(threadName1+(count=count+2));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		public static void main(String[] args) {
		ThreadClass thread=new ThreadClass("thread1");
		Thread obj=new Thread(thread);
		obj.start();
		ThreadClass thread1=new ThreadClass("thread2");
		Thread obj1=new Thread(thread1);
		obj1.start();
		ThreadClass thread2=new ThreadClass("thread3");
		Thread obj2=new Thread(thread2);
		obj2.start();
		
		ThreadClass thread3=new ThreadClass("thread4");
		Thread obj3=new Thread(thread3);
		obj3.start();
		
		
	}
}
