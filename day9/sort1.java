import java.util.Scanner;
import java.util.Arrays;
class sort1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enetr no. of elements u want in array");
int n,i=0;
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter all elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
int temp=0;
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}}
for(int x:a)
System.out.print(x+" ");
}
}