import java.util.Scanner;
class smallest1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a<b && a<c)
{
System.out.println("smallest is "+a);
}
else if(b<a && b<c)
{
System.out.println("smallest is "+b);
}
else
{
System.out.println("smallest is "+c);
}
}

}

