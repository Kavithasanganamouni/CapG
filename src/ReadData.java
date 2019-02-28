import java.io.FileInputStream;

public class ReadData {
	public static void main(String[] args)throws Exception
	{
		FileInputStream f1=new FileInputStream("D:\\sample1.txt");
		int data=f1.read();
		while(data!=-1) {
		System.out.print((char)data);
		
	data=f1.read();
		
	}
f1.close();
}
}
