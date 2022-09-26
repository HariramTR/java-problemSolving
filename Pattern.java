package task3;
import java.util.*;
public class Pattern {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter the value :");
		      int t=0,k=1,i;
		      int n = sc.nextInt();
		      for( i=1;i<=n;i++) {
		          for(int j=1;j<=n-i;j++) {
		              System.out.print(" ");
		          }
		          k = t+i;
		          t = k;
		          for(int j=1;j<=i;j++) {
		              System.out.print(k-- +" ");
		          }
		          
		          
		          System.out.println();
		      }
		      k=t+i;
		      t=k;
		      for( i=n;i>=1;i--) {
		          for(int j=i;j<n;j++) {
		              System.out.print(" ");
		          }
		          k=t-i-1;
		          t=k;
		          for(int j=1;j<=i;j++) {
		              System.out.print(k-- +" ");
		          }
		          System.out.println();
		      }
		    }
	}


