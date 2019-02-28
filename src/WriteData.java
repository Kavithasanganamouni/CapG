import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Writer;


public class WriteData {
public static void main(String[] args)throws Exception
{
	FileOutputStream output=new FileOutputStream("Sample.txt");

	//String s="kavitha";
//int amount=1000;
//	byte b[]=s.getBytes();
	
	output.write(123 );
	output.close();
	
	//output.write(String.valueOf(123));
	//output.close();
}

}
