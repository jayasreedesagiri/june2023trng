import java.util.Scanner;
class product1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sd=1;

while(n>0)
{
sd=sd*10+(n%10);
n=n/10;
}
System.out.println(sd);
}
}