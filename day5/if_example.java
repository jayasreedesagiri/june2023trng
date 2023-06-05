import java.util.Scanner;
class if_example
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int min;
if(a>b)
{
min=b;
System.out.println("min number is "+min);
}
else
{
min=a;
System.out.println("min number is "+min);
}
}
}

