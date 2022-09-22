/*5) Given an array of size N containing only 0s, 1s, and 2s; sort the array in
ascending order.
Example 1:
Input:
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Example 2:
Input:
N = 3
arr[] = {0 1 0}
Output:
0 0 1*/
package task2;
import java.util.*;
public class ascendingorder {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("N = ");
int n = sc.nextInt();
System.out.println("Enter the given values : ");
int a[] = new int[n];
for(int i=0;i<n;i++) {
	a[i] = sc.nextInt();
}
for(int i=0;i<n;i++) {
    for(int j=i+1;j<n;j++) {
    if(a[i] > a[j]) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    }
System.out.print(a[i]+" ");
}
}
}