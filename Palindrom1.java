package pdf3;

import java.util.*;

public class Palindrom1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		   System.out.print("Enter the string :");
		   String name = sc.nextLine();
		   int i=0, j=name.length()-1;
		   if(name.charAt(i) == name.charAt(j)) {
		      System.out.println("Given string is palindrom");
		      } else {
		        System.out.println("Given String is not Palindrom");
		      }

	}

}
