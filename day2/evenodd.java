import java.util.*;

class evenodd
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
n=sc.nextInt();
if((n/2)*2==n)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}