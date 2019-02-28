
public class Synchro implements Runnable{
	String threadName;
	public	 Synchro(String thread)
		{
			this.threadName=thread;
		}
		synchronized static void calculate()
		{
			for(int i=1;i<10;i++)
			{
				System.out.println(i);
			}
		}

		public void run()
		{
			calculate();
		
		}
		public static void main(String[] args) {
			Synchro thread=new Synchro("thread1");
			Thread obj=new Thread(thread);
			//obj.start();
		Synchro thread1=new Synchro("thread2");
			Thread obj1=new Thread(thread1);
			//obj1.start();
			Synchro thread2=new Synchro("thread3");
			Thread obj2=new Thread(thread2);
			obj.start();
			obj1.start();
			obj2.start();
			
			
			

		}
}