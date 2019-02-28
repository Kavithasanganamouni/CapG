
public class RunableThread  implements Runnable 
	{ 
	    public void run() 
	    { 
	        System.out.println("welcome thread");
	  
	        } 
	        
	    public static void main(String[] args)
	    {
	    	RunableThread thread=new RunableThread();
	    	Thread obj=new Thread(thread);
	    	obj.start();
	    }
	
	  
	}
	
