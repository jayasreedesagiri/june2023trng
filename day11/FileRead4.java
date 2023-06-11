import java.io.*;
class FileRead4{
public static void main(String args[])throws Exception{
FileReader fr=new FileReader("C:\\JtrainingJune23\\fh\\Demo.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int countVowel=0;
while((i=br.read())!=-1){
if(((char)i=='1'||((char)i=='2')||((char)i=='3')||((char)i=='4')||
((char)i=='5')||((char)i=='6')||((char)i=='7')||((char)i=='8')||
((char)i=='9')||((char)i=='0')))
countVowel++;}
System.out.println(countVowel);
br.close();
fr.close();
}

}
