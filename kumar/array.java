package kumar;
import java.util.*;
public class array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int n = sc.nextInt();
		int a[] = new int[n];
		int i = 0;
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
			
			
		}
		System.out.println("array elements");
		for(i=0;i<n;i++) {
			    //a[i] = sc.nextInt();
			    System.out.println(a[i]);
		}

	}

}
