import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeExample {
public static void main(String[] args)throws Exception
{Employee emp=null;
	FileInputStream fin=new FileInputStream("D:\\sample11.txt");
	ObjectInputStream in=new ObjectInputStream(fin);
	
	emp=(Employee)in.readObject();
	in.close();
	fin.close();
	System.out.println(emp.name);
	System.out.println(emp.address);
}
}
