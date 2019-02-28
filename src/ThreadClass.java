
public class ThreadClass extends Thread {
	String threadName1;
	ThreadClass(String thread)
	{
		this.threadName1=thread;
	}
	public void run()

	{
		System.out.println("the execution of"+threadName1);
		
	}
	
public static void main(String[] args) {
	ThreadClass thread=new ThreadClass("thread1");
	Thread obj=new Thread(thread);
	obj.start();
	
	ThreadClass thread1=new ThreadClass("thread2");
	Thread obj1=new Thread(thread1);
	obj1.start();
	
	
}
}
