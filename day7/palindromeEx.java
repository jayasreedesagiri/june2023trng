import java.util.Scanner;
class palindromeEx
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
String s="";
int len=a.length();
for(int i=len-1;i>=0;i--)
{
s=s+a.charAt(i);
}
if(s.equalsIgnoreCase(a))
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}


