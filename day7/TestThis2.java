class Student
{
int rollno;
String name;
float fee;
Student(int rollno,String name,float fee)
{
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display()
{
System.out.println(rollno+" "+name+" "+fee);
}
}
class TestThis2
{
public static void main(String args[])
{
Student  s1=new Student(111,"jayasree",5000f);
Student  s2=new Student(222,"reshma",6000f);
Student  s3=new Student(333,"haritha",7000f);
Student  s4=new Student(444,"bhanu",5000f);
Student  s5=new Student(555,"kalpana",5000f);
s1.display();
s2.display();
s3.display();
s4.display();
s5.display();
}
}
