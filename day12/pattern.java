import  java.util.Scanner;
class pattern
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int j;
for(int i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}
}
}