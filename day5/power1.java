import java.util.Scanner;
class power1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int x=1;
for(int i=1;i<=b;i++)
{
x=x*a;
}
System.out.println(x);

}}