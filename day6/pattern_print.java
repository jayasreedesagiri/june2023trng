import java.util.Scanner;
class pattern_print
{
public static void pattern(char c,int j)
{
for(int i=0;i<=j;i++)
{
System.out.println();
for(int n=0;n<=i;n++)
System.out.print(c);

}
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
pattern(ch,row);

}
}

