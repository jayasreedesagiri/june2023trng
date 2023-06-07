import java.util.Scanner;
class print_stars
{
public static void print_multiple_stars(int i)
{
int k=1;
for(;k<=i;k=k+1)
System.out.println("*");
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int j=sc.nextInt();
print_multiple_stars(j);
System.out.println(" ");
}
}
