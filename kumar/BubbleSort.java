package kumar;


import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter array elements ");
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Sorted elements ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("Second largest element "+a[1]);
	}

}
