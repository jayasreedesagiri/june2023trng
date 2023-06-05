import java.util.Scanner;
class sum1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sd=0;

while(n>0)
{
sd=sd+n%10;
n=n/10;
}
System.out.println(sd);
}
}

