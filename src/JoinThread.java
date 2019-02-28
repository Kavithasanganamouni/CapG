
public class JoinThread implements Runnable {
	
	public void run()
	{
		
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			public static void main(String[] args) throws InterruptedException {
			JoinThread thread=new JoinThread();
			Thread obj=new Thread(thread);
			obj.setName("thread one");
			obj.start();
			obj.join(5000);
			JoinThread thread1=new JoinThread();
			Thread obj1=new Thread(thread);
			obj1.setName("thread two");
	     	obj1.start();
			  obj1.join(5000);
			JoinThread thread2=new JoinThread();
			Thread obj2=new Thread(thread);
			obj2.setName("thread three");
			
			obj2.start();
			obj2.join(5000);
			JoinThread thread3=new JoinThread();
			Thread obj3=new Thread(thread);
			obj3.setName("thread four");
			obj3.start();
			
			
			
			
		}
	}


