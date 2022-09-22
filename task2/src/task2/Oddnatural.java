/*3(L1).Write a program in Java to display the n terms of odd natural number
and their sum.
Input number of terms is: 5
Expected Output :
The odd numbers are :
1
3
5
7
9
The Sum of odd Natural Number up to 5 terms is: 25*/
package task2;
import java.util.*;
public class Oddnatural {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
	   int n = sc.nextInt();
	   System.out.println("Input number of terms is :" +n);
	   System.out.println("The odd numbers are : ");
		for(int i=0;i<n*2;i++) {
			i++;
		System.out.println(i+" ");
		}
		System.out.println("The term of odd number up to " +n+ " terms is : " +n*n);
     }
}
