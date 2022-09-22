package task2;

import java.util.Scanner;
public class Power {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int num = 1;
System.out.print("enter the number : ");
		int n = sc.nextInt();
		System.out.print("enter the number : ");
		int n1 = sc.nextInt();
		for(int i=num;i<=n1;i++) {
		     num = num*n;
		
		}
		System.out.println(num);
		
}
}
