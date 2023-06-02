import java.util.*;

class evenodd1
{
public static boolean iseven(int n)
{
if(n%2==0)
{
return true;
}
else
{
return false;
}
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
n=sc.nextInt();
if(iseven(n))
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}