import java.util.Scanner;
class palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

String rs="";
System.out.println("enter a string:");
String n=sc.next();

int len=n.length()-1;
for(int i=len;i>=0;i--)
{
rs=rs+n.charAt(i);
}

if(rs!=n)
{
System.out.println("It is  not a palindrome");
}
else
{
System.out.println("It is a palindrome");
}
}
}
