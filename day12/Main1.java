import java.util.Scanner;
public class Main1{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=0;
for(int i=1;i<=n;i++) {
for(int j=1;j<=i;j++) {
System.out.print(c+" ");
c++;
}
System.out.println();
}
}
}
