import java.util.*;
public class Program205s
{
public static void main(String args[])
{
char ch;
System.out.println("enter ");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
System.out.println();
if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
System.out.println(ch + " is an alphabet");
else if(ch>='0' && ch<='9')
System.out.println(ch + " is a digit");
else
System.out.println(ch + " is a special character");
}
}