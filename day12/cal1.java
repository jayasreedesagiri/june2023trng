class cal1 implements runnable{
public static void main(String args[])
{
cal1 obj=new cal1();
Thread threadobj=new Thread(obj);
threadobj.start();
System.out.println("threads inside main are very much helpfull in java");
}
public void run(){
System.out.println("threads from overriden run method are very ");
}
}