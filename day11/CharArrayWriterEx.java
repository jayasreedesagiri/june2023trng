import java.io.CharArrayWriter;
import java.io.FileWriter;
class CharArrayWriterEx{
public static void main(String args[])throws Exception{
CharArrayWriter out=new CharArrayWriter();
out.write("welcome to this training");
FileWriter f1=new FileWriter("C:\\JtrainingJune23\\fh\\a.txt");
FileWriter f2=new FileWriter("C:\\JtrainingJune23\\fh\\b.txt");
FileWriter f3=new FileWriter("C:\\JtrainingJune23\\fh\\c.txt");
FileWriter f4=new FileWriter("C:\\JtrainingJune23\\fh\\d.txt");
out.writeTo(f1);
out.writeTo(f2);
out.writeTo(f3);
out.writeTo(f4);
f1.close();
f2.close();
f3.close();
f4.close();
System.out.println("success..");
}
}

