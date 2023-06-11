import java.util.Scanner;
import java.util.Arrays;
class A
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sum=0;
float avg;
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
System.out.println(a[0]+" "+a[n-1]);
for(int j:a)
{
sum=sum+j;
}
System.out.println(sum);
avg=sum/n;
System.out.println(avg);
}
}

