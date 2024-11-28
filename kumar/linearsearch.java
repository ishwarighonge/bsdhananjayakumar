package kumar;

import java.util.Scanner;

public class linearsearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int pos = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		
		System.out.println("Enter element to Search");
		int key = s.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]== key) {
				pos = i+1;
				
			}
		}
		if(pos>0) {
			System.out.println(key+" found at position "+pos);
			System.out.println("Successful search");
		}else {
			System.out.println("Unsuccessful search");
			System.out.println(key+"not found");
		}

	}

}
