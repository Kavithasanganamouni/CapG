import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

public class Serialize1 
{
public static void main(String[] args)throws Exception {
	Employee emp=new Employee();
	
	emp.name="kavi";
	emp.address="hyd";
	FileOutputStream fout=new FileOutputStream("D:\\sample11.txt");
	ObjectOutputStream out=new ObjectOutputStream(fout);
	out.writeObject(emp);
	out.close();
	fout.close();
}
}

