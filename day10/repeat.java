import java.util.Scanner;
class repeat
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char c=sc.next().charAt(0);
String z="";
for(int i=0;i<=s.length()-1;i++)
{
char x=s.charAt(i);
if(x!=c)
{
z=z+s.charAt(i);
}
}
System.out.println(z);
}
}