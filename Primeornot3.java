package pdf3;
import java.util.*;
public class Primeornot3 {
public static void main(String[] args) {
		int a,b,c;
	    System.out.println("Enter the value :");
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    boolean  prime = true;
	    for(int i=2;i<n;i++) {
			 if(n%i==0) {
			 prime = false; 
			 break;
			 }
	   }
	   System.out.println(prime);
	   System.out.println(n);
	      a=n;
		  a = n/10;
	      b = n%10;
		  c = (b*10) + a;
		  System.out.println(c);
		  for(int j=2;j<c;j++) {
			  if(c%j==0) {
			  prime = false; 
			  break;
			   }
	 }
		 System.out.println(prime);
			  }

	}


