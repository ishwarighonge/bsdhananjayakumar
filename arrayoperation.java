package kumar;

import java.util.Scanner;

public class arrayoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		int a[] = new int[n];
		int i = 0;
		int sum = 0;
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];
			
			
		}
		System.out.println("sum: " +sum);
		System.out.println("average: "+(float)sum/n);
		/*for(i=0;i<n;i++) {
		         //a[i] = sc.nextInt();
		         System.out.println(a[i]);
		 }*/

	}

}
