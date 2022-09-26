package task3;
import java.util.*;
public class Occurrencesofnumber {
	    public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the value :");
	     int n = sc.nextInt();
	     System.out.println("Enter the values :");
	     int a[] = new int[n];
	     for(int i=0;i<n;i++) {
	         a[i] = sc.nextInt();
	     }
	    for(int i=0;i<=9;i++) {
	        int count = 0;
	        for(int j=0;j<n;j++) {
	            if(a[j] == i) {
	                count++;
	            }
	        }
	        if(count !=0) {
	            System.out.println(i+ " -- "+count);
	        }
	        
	    }
	        
	    }
	}
