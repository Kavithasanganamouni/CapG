
public class SynchronizeThread implements Runnable{
	String threadName;
	public SynchronizeThread(String thread)
	{
		this.threadName=thread;
	}
	
public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(threadName +"is  "  +i);
		}
	
	}
	public static void main(String[] args) {
		SynchronizeThread thread=new SynchronizeThread("thread1");
		Thread obj=new Thread(thread);
	//	obj.start();
		SynchronizeThread thread1=new SynchronizeThread("thread2");
		Thread obj1=new Thread(thread1);
	//	obj1.start();
		SynchronizeThread thread2=new SynchronizeThread("thread3");
		Thread obj2=new Thread(thread2);
		obj.start();
		obj1.start();
		obj2.start();
		
		}

}
