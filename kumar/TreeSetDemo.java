package kumar;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set->Interface->will not allow duplicate values
				//HashSet, does not maintain insertion order
				//single null is allowed
				//no duplicate values
				//LinkedHashSet
				//TreeSet

				TreeSet<Integer> lobj1 = new TreeSet<Integer>();
				lobj1.add(100);
				lobj1.add(67);
				lobj1.add(67);
				lobj1.add(87);
				lobj1.add(90);

				System.out.println(lobj1);


	}

}
