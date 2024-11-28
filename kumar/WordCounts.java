package kumar;

public class WordCounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello how are you?"; //4
		int wc=0;
		// for(int i=0;i<s.length();i++) {
		// char ch= s.charAt(i);
		// 
		// if(ch==' ') {
		// wc++;
		// }
		// }

		String sw[]=s.split(" "); //{"Hello,"how","are","you?"}
		System.out.println("Number of words "+sw.length);


	}

}
