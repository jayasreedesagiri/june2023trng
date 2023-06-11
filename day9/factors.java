import java.util.Scanner;
class factors
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=0;
for(int i=1;i<n;i++)
{
if(n%i==0)
{
c=c+1;
System.out.print(i+",");
}
}
System.out.println(n);
System.out.println(c);
if(c==1)
{
System.out.println("prime");
}
else
{
System.out.println("not prime");
}
}
}