import java.util.Scanner;
class examsol
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String a="";
for(int i=0;i<=s.length()-1;i++)
{
 if(s.charAt(i)>='0' && s.charAt(i)<='9')
{
a=a+s.charAt(i);
}
}
System.out.print(a);
}
}

