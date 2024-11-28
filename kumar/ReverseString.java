package kumar;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int i = 0;
		for(i=str.length()-1;i>=0;i--) {
			System.out.printf("%c", str.charAt(i) );
		}
		

	}

}
