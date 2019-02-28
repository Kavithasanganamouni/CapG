import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Read2 {
public static void  main(String args[])throws Exception
{FileInputStream finput=new FileInputStream("D://sample1.txt");
BufferedInputStream buffer=new BufferedInputStream(finput);

int data=buffer.read();
while(data!=-1) {
System.out.print((char)data);

data=buffer.read();

}
}
}
