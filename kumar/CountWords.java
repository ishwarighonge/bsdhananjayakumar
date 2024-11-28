package kumar;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello how are you?"; //4
		int wc=0;
		for(int i=0;i<s.length();i++) {
		char ch= s.charAt(i);

		if(ch==' ') {
		wc++;
		}
		}
		System.out.println("Number of words "+(wc));


	}

}
