import java.util.*;
public class Program205_readString
{
public static void main(String args[])
{
System.out.println("enter your name");
Scanner sc=new Scanner(System.in);
String n=sc.next();
char ch=n.charAt(2);
System.out.println("welcome " +n+ ch);
}
}
