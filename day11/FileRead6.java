import java.io.*;
class FileRead6{
public static void main(String args[])throws Exception{
FileReader fr=new FileReader("C:\\JtrainingJune23\\fh\\Demo.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int countCon=0;
while((i=br.read())!=-1){
if(((char)i!='a'||((char)i!='e')||((char)i!='i')||((char)i!='o')||
((char)i!='u')||((char)i!='A')||((char)i!='E')||((char)i!='I')||
((char)i!='O')||((char)i!='U')))
countCon++;}
System.out.println(countCon);
br.close();
fr.close();
}

}
