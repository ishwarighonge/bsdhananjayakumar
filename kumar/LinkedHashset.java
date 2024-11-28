package kumar;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set->Interface->will not allow duplicate values
		//HashSet, does not maintain insertion order
		//single null is allowed
		//no duplicate values
		//LinkedHashSet
		//TreeSet

		LinkedHashSet<Integer> lobj = new LinkedHashSet <Integer>();
		lobj.add(67);
		lobj.add(67);
		lobj.add(67);
		lobj.add(87);
		lobj.add(90);
		lobj.add(null);

		System.out.println(lobj);


	}

}
