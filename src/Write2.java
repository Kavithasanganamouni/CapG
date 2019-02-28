import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Write2 {
public static void main(String[] args)throws Exception
{
	FileOutputStream foutput=new FileOutputStream("D:\\sample2.txt");
	BufferedOutputStream buffout=new BufferedOutputStream(foutput);
	String name="kavitha";
	byte[] b=name.getBytes();
	buffout.write(b);
	//foutput.close();
	buffout.close();
	foutput.close();
	
}
}
