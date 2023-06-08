class Student
{
int rollno;
String name;
static String college="ITS";
static void change()
{
college="MTIET";
}
Student(int r,String n){
rollno=r;
name=n;

}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
public class TestStaticMethod
{
public static void main(String args[])
{
Student.change();
Student s1=new Student(111,"jaya");
Student s2=new Student(222,"reshma");
Student s3=new Student(333,"kavya");
s1.display();
s2.display();
s3.display();
}
}
