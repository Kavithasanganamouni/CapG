import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.FileWriter;
public class CopyChar {
public static void main(String[] args)throws Exception
{FileReader input=new FileReader("D:\\sample6.txt");
FileWriter output=new FileWriter("D:\\sample10.txt");
FileWriter output1=new FileWriter("D:\\sample11.txt");
CharArrayWriter charray=new CharArrayWriter();
int data;

while((data = (byte)input.read())!=-1) {
	output.write(data);
	 
	   charray.write(data);
}
	  charray.writeTo(output);
	   			charray.writeTo(output1);
	   			charray.close();
	   			input.close();
	   			output.close();
	   			output1.close();
	   			}

}
