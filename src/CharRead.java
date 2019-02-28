import java.io.FileReader;

public class CharRead {
public static void main(String[] args)throws Exception
{
	FileReader input=new FileReader("D:\\sample6.txt");
	int data = input.read();
	while(data!=-1) {
	
		System.out.print((char)data);
		data=input.read();
	}
	input.close();
}
}
