
import java.io.FileWriter;

public class Charwrite {

	public static void main(String[] args)throws Exception {
		

		FileWriter output=new FileWriter("D:\\sample9.txt");
		String name="kavitha";
		output.write(name);
	
		output.close();
	
	}
}
