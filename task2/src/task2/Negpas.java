/*4) Given an unsorted array arr[] of size N having both negative and positive
integers. The task is place all negative element at the end of array without
changing the order of positive element and negative element.
Example 1:
Input :
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output :
1  3  2  11  6  -1  -7  -5
Example 2:
Input :
N=8
arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
Output :
7  9  10  11  -5  -3  -4  -1*/
package task2;
import java.util.*;
public class Negpas {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter how many numbers in array : ");
	int n = sc.nextInt();
	System.out.print("Enter this number : ");
	int a[] = new int[n];
	int i;
	for( i=0;i<n;i++) {
		a[i] = sc.nextInt();
	}
	for(int j=0;j<n;j++) {
	    if(a[j]>0) {
	        System.out.print(" ");
	        System.out.print(a[j]);
	    } 
	}
		for(int k=0;k<n;k++) {
	    if(a[k]<0) {
	        System.out.print(" ");
	        System.out.print(a[k]);
	    } 
	}
}
}
