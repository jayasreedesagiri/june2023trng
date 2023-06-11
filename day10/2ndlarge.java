import java.util.Scanner;
import java.util.Arrays;
class 2ndlarge
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
Sytem.out.println(a[n-2]);
}
}