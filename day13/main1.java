
import java.util.Scanner;
class main extends Exception
{
String msg;
main(String msg)
{
super(msg);
this.msg=msg;
}
@Override
public String toString()
{
return msg;
}
}
class main1
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int rollno=sc.nextInt();
String name=sc.next();
int Marks=sc.nextInt();

try
{
if(Marks<0)
{
throw new main("Entered Marks should be  positive");
}
}
catch(main ex)
{
System.out.println(ex);
System.out.println(ex.getMessage());
}}
}