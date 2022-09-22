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
import java.util.Scanner;
public class Sameornot {
public static void main(String args[]) {
Scanner in=new Scanner(System.in);
		int h=2;
		System.out.print("String a : ");
		String S1=in.next();
		System.out.print("String b  :  ");
		String S2=in.next();
		char[] x=S1.toCharArray();
		int n = x.length;
		while(h>0) {
			char temp=x[0];
			for(int i=0;i<n-1;i++) {
				x[i]=x[i+1];
			}
			x[n-1]=temp;
			h--;
		}
		char y[]=S2.toCharArray();
		int n2=y.length;
		int flag=0;
		for(int i=0;i<n;i++) {
			if(x[i]!=y[i]) {
				flag++;
				break;
			}
		}
		if(flag==0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
}

}



			
		