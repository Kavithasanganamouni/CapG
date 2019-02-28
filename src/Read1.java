import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Read1 {
public static void main(String[] args)throws Exception
{
	FileInputStream input=new FileInputStream("D:\\Capg.txt");
	FileOutputStream output=new FileOutputStream("");
	int data;
	while((data=input.read())!=-1) {
		output.write(data);
	}

	input.close();
	output.close();
}
}
