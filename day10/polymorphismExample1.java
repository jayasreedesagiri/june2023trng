import java.util.Scanner;
class polymorphismExample1
{
void print()
{
System.out.println("welcome");
}
void print(String n)
{
System.out.println("welcome "+n);
}
}
class Test
{
public static  void main(String args[])
{
polymorphismExample1 p=new polymorphismExample1();
p.print();
Scanner sc=new Scanner(System.in);
System.out.println("enter ur name:");
String s=sc.next();
p.print(s);
}
}