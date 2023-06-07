import java.util.Scanner;
class print_stars_plus_minus
{
public static void print_multiple_chars(int i,char c)
{
int k=1;
for(;k<=i;k=k+1)
System.out.println(c);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int j=sc.nextInt();
char ch=sc.next().charAt(0);
print_multiple_chars(j,ch);
print_multiple_chars(j+1,ch);
print_multiple_chars(j+2,ch);
System.out.println("");


}
}
