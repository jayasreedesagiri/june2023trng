import java.math.pow;
import java.util.Scanner;
class powernumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int x=pow(a,b);
System.out.println(x);
}
}