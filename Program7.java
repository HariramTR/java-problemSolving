/*7. Given an odd length word which should be printed from the middle of the word.
The output should be in the following pattern.
Example:
Input: PROGRAM
Output:
G
GR
GRA
GRAM
GRAMP
GRAMPR
GRAMPRO */

package pdf3;
import java.util.*;
public class Program7 {
public static void main(String[] args) {
		       Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the string : ");
		        String name = sc.nextLine();
		        int n = name.length();
		        for(int i=0;i<n;i++) {
		            for(int j=1;j<=n-i;j++) {
		                System.out.print("   ");
		            }
		            int middle=n/2;
					for(int j=0;j<i+1;j++)
					{
					System.out.print(name.charAt((middle++)%n));
					}
					System.out.println();
		        }
		    }
	    }


