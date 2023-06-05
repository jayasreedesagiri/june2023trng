import java.util.Scanner;
class reverse1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int n=s.length();
int sd=0;

while(n>0)
{
sd=sd*10+(n%10);
n=n/10;
}
System.out.println(sd);
}
}