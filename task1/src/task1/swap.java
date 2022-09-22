/*2(L1). Write a Java program to swap two variables.*/
package task1;
import java.util.*;
public class swap {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the two values :");
int n = sc.nextInt();
int n1 = sc.nextInt();
System.out.println("Before Sewp :");
System.out.println("n = " +n+ "   n1 = " +n1);
int  temp = n;
n = n1;
n1= temp;
System.out.println("After Sewp :");
System.out.println("n = " +n+ "   n1 = " +n1);
}
}
