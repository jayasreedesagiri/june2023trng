import java.io.*;
public class BufferedReaderEx{
public static void main(String args[])throws Exception{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);

System.out.println("enter ur name");
String name=br.readLine();
System.out.println("welcome "+name);
}
}
