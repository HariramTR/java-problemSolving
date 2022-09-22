/*1(L1). Write a Java program that takes a number as input and prints its
multiplication table up to 10*/
package task1;
import java.util.*;
public class multiplication {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value :");
int n = sc.nextInt();
for(int i=1;i<=n;i++) {
System.out.println(i+ "*" +n+ "=" + i*n);
	}
	}
}
