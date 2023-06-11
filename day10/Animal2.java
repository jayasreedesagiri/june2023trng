class Animal2
{
public void move()
{
System.out.println("call from animal class");
}
}
class Wild extends Animal2{
public void move()
{
System.out.println("call from wild class");
}
}
class Pet  extends Animal2{
public void move()
{
System.out.println("call from Pet class");
}
}
class TestAnimal
{
public static void main(String args[])
{
Animal2 a=new Animal2();
Animal2 w=new Wild();
Animal2 p=new Pet();
a.move();
w.move();
p.move();
}

}