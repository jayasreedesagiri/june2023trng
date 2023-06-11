class Animal1
{
public void move()
{
System.out.println("animals can move");
}
}
class Dog extends Animal1{
public void move()
{
System.out.println("Dogs can walk and run");
}
}
class TestDog
{
public static void main(String args[])
{
Animal1 a=new Animal1();
Animal1 b=new Dog();
a.move();
b.move();
}
}