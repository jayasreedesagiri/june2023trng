import java.util.Scanner;
import java.util.Arrays;
class small_large
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println();
int n,i=0,c=0,avg;
n=sc.nextInt();
int a[]=new int[n];
System.out.println();
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
System.out.println(a[0]+" "+a[n-2]);
for(int k:a)
{
c=c+k;
}
System.out.println(c);
avg=c/n;
System.out.println(avg);
}
}