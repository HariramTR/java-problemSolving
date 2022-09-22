/*6) Given an array A of size N of integers. Your task is to find the minimum
and maximum elements in the array.
Example 1:
Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output:
min = 1, max = 10000
Example 2:
Input:
N = 5
A[] = {1, 345, 234, 21, 56789}
Output:
min = 1, max = 56789*/
package task2;
import java.util.*;
public class Minmax {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the limit : ");
int n = sc.nextInt();
System.out.print("Enter the given values : ");
int a[] = new int[n];
for(int i=0;i<n;i++) {
	a[i] = sc.nextInt();
}
	for(int j=1;j<n;j++) {
		if(a[0] > a[j]) {
			int temp = a[0];
			a[0] = a[j];
			a[j] = temp;
		}
	}

		System.out.print("Minimum value = " +a[0]+",  ");
		for(int j=1;j<n;j++) {
			if(a[0] < a[j]) {
				int temp = a[0];
				a[0] = a[j];
				a[j] = temp;
			}
		}
		System.out.println("Maximum value = " +a[0]);
		
	}
	
}

	


