

	import java.io.BufferedOutputStream;
	import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

	public class CopyRead {

		public static void main(String[] args)throws Exception
		{
			FileInputStream finput=new FileInputStream("D:\\sample6.txt");
		FileOutputStream foutput=new FileOutputStream("D:\\sample7.txt");
			FileOutputStream foutput1=new FileOutputStream("D:\\sample8.txt");
			ByteArrayOutputStream byteout=new ByteArrayOutputStream();
        byte data;
while((data = (byte)finput.read())!=-1) {
byteout.write(data);
}
byteout.writeTo(foutput);
			byteout.writeTo(foutput1);
			byteout.close();
			finput.close();
			foutput.close();
			foutput1.close();

		}

	}


