/*3) Given two strings a and b. The task is to find if the string 'b' can be obtained
by rotating another string 'a' by exactly 2 places.
Example 1:
Input:
a = amazon
b = azonam
Output: 1
Example 2:  Input:
a = geeksforgeeks
b = geeksgeeksfor
Output: 0*/
package task2;

import java.util.*;
public class Sameornot {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
		System.out.print("String a : ");
		String S1=sc.next();
		System.out.print("String b  :  ");
		String S2=sc.next();
		int h=2;
		char[] x=S1.toCharArray();
		int n = x.length;
		while(h>0) {
			//if(h>0) {
			char temp=x[0];
			for(int i=0;i<n-1;i++) {
				x[i]=x[i+1];
			}
			
			x[n-1]=temp;
			h--;
		}
		String S3=String.valueOf(x);
		
		if(S3.equals(S2)) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
}
}