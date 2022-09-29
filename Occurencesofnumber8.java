/*8. Given an array of positive integers. The output should be the number of occurrences of each
number.
Example:
Input: {2, 3, 2, 6, 1, 6, 2}
Output:
1 – 1
2 – 3
3 – 1
6 – 2*/
package pdf3;
import java.util.*;
public class Occurencesofnumber8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit :");
		int n = sc.nextInt();
		System.out.println("Enter the values :");
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<=n;i++) {
			int count = 0;
			for(int j=0;j<n;j++) {
				if(a[j] == i) {
					count++;
				}
			}
			if(count !=0) {
				System.out.println(i+ " ~~~> "+count);
			}
		}
	}
}





