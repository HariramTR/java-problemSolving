package task5;
import java.util.*;
public class Countwords {

	public static void main(String[] args) {
		String str = new String();
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter the string : ");
	     str = sc.nextLine();
	     int count =1;
	     for(int i=0;i<str.length();i++) {
	         if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
	             count = count+1;
	         }
	        
	     }
	      System.out.println("Number of words in the string : " +count);

	}

}
