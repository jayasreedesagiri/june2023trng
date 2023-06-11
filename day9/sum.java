class sum
{
public static void main(String args[])
{
int[] numbers={2,-9,0,5,12,-25,22,9,8,12};
int sum=0;
for(int a:numbers)
{
sum=sum+a;javac sum
}
int len=numbers.length;
double avg=((double)sum/(double)len);
System.out.println(sum);
System.out.println(avg);
}
}
