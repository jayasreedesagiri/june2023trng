import java.util.Scanner;
class replaceAll{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String c=sc.next();
String r=sc.next();
String res=str.replace(c,r);
System.out.print(res);
}
}


