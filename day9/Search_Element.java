import java.util.Scanner;
class Search_Element
{
public static void main(String args[])
{
int n,x,i=0,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("enetr no. of elements u want in array");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter all elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}

System.out.print("enter the element u want");
x=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==x)
{
flag=1;
break;
}
else
{
flag=0;
}
}
if(flag==1)
{
System.out.println("element is present in array at position"+(i+1));
}
else
{
System.out.println("element is not present in array");
}
}
}