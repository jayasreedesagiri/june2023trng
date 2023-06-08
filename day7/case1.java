import java.util.Scanner;
class case1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String a="";
int ascii;
for(int i=0;i<=s.length()-1;i++)
{
 if(s.charAt(i)>='A' && s.charAt(i)<='Z')
{
ascii=s.charAt(i);
ascii+=32;
a=a+(char)ascii;
}
else
{
 a=a+s.charAt(i);
}
}
System.out.println("a:"+a);
}
}