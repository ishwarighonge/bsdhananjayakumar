package kumar;
import java.util.*;
import java.lang.*;
public class Stringsday1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s[] = str.split(" ");
		int i = 0;
		System.out.println("Printing words at even position with even length in a string:");
		for(i=1;i<s.length;i=i+2) {
			if(s[i].length()%2==0)
				System.out.println(s[i]);
		}
		
	}

}
