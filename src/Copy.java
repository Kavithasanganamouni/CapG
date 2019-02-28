import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class Copy {

	public static void main(String[] args)throws Exception
	{
	FileOutputStream foutput=new FileOutputStream("D:\\sample4.txt");
		//BufferedOutputStream buffout=new BufferedOutputStream(foutput);
				FileOutputStream foutput1=new FileOutputStream("D:\\sample5.txt");
		//BufferedOutputStream buffout1=new BufferedOutputStream(foutput);
				ByteArrayOutputStream byteout=new ByteArrayOutputStream();
		String name="hello";
		byte[] b=name.getBytes();
		//System.out.println(b);
		byteout.write(b);
		byteout.writeTo(foutput);
		byteout.writeTo(foutput1);
		byteout.close();
		foutput.close();
		foutput1.close();

	}

}
