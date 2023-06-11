import java.util.Scanner;
import java.util.Arrays;
class sort
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
Arrays.sort(a);
for(int j:a)
System.out.print(j+" ");

System.out.println("smallest element is "+a[0]);
System.out.println("largest element is "+a[n-1]);
}
}
