package task5;
import java.util.*;
public class Smallestnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	       System.out.print("input the first number : ");
	      int a = sc.nextInt();
	       System.out.print("input the second number : ");
	      int b = sc.nextInt();
	       System.out.print("input the third number : ");
	      int c = sc.nextInt();
	      if(a<b && a<c){
	          System.out.println("The Smallest value is :" +a);
	      }
	     else if(b<a && b<c){
	          System.out.println("The Smallest value is :" +b);
	      }
	      else {
	          System.out.println("The Smallest value is : "+c);
	      }
	    }	

	}


