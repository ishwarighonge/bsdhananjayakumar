package kumar;

import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int pos = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the elements in ascending order");
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Enter the element to search");
		int key = s.nextInt();
		
		// 4 6 8 12 18
		// l=0 mid=2 h=a.length-1
		
		int low=0, mid;
		int high=a.length-1;
		/*
		 * mid=(low+high)/2; 0+4/2=2
		 */
		while(low<=high) {
			mid = (low+high)/2;
			
			if(a[mid]== key) {
				pos = mid+1;
				break;
			}
			
			if(key>a[mid]) {
				low=mid+1;
			}
			else if(key<a[mid]) {
				high = mid-1;
			}
		}
		
		if(pos>0) {
			System.out.println(key+" found at position "+pos);
		}else {
			System.out.println(key+" font found");
		}

	}

}
