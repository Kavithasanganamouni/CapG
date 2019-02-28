import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Customer implements Callable{
	String name;
         public String call()throws Exception {
				 Scanner sc=new Scanner(System.in);
			   this.name=sc.next();
			   return name;
				}
				public static void main(String[] args) throws InterruptedException, ExecutionException {
		int i=0;
		ExecutorService obj1 = Executors.newFixedThreadPool(3);
		 ArrayList<Future<String>> obj = new ArrayList<Future<String>>();
		Callable object=new Customer();
		for(i=0;i<3;i++)
		{
			Future future = obj1.submit(object);
			obj.add(future);
			
		}
		for(Future<String> futureobj:obj)
		{
			System.out.println(futureobj.get());
		}
		
 		
	}}
