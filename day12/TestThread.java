class TestThread extends Thread{
public static void main(String args[])
{
TestThread tob=new TestThread();
tob.start();
System.out.println("the code is outside of thread");
}
public void run(){
System.out.println("This code is running in a thread");
}
}