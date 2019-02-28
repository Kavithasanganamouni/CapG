import java.io.Console;

public class Console1 {

	public static void main(String[] args) {
		Console obj=System.console();
		if(obj==null) {
			System.out.println("missing");
		}
		else
		{
			System.out.println("not missing");
		}
			

	}

}
