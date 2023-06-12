import java.util.Scanner;
public class PatternPrinter{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
int rows=sc.nextInt();
for(int i = 0; i < rows; i++) {
for (int j = 0; j < 2 * rows - 1; j++) {
if (j >= rows - 1 - i && j <= rows - 1 + i) {
System.out.print("*");
} else {
System.out.print("#");
}
}
System.out.println();
}
}
}

