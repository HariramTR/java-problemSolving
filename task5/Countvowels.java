package task5;
import java.util.*;
public class Countvowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the string : ");
	    String s = sc.nextLine();
	    int  n = s.length() , c=0;
	    char ch;
	    String s1 = s.toLowerCase();
	    String s2 = s.toUpperCase();
	    for(int i=0;i<n;i++) {
	        ch = s.charAt(i);
	        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ) {
	        c++;
	      }
	   }
	      System.out.println("Number of vowels in the string : " +c);
	    }
    }
