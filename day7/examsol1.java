import java.util.Scanner;
class examsol1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String a="";
int ascii;
for(int i=s.length()-1;i>=0;i--)
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
s=a;
String rev="";
for(int i=s.length()-1;i>=0;i--)
{
rev=rev+s.charAt(i);
}
if(s.equals(rev))
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}
