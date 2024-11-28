package kumar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hobj = new HashMap<Integer, String>();
		hobj.put(101, "Kiran");
		hobj.put(102, "Priya");
		hobj.put(103, "Preethi");
		hobj.put(105, "Kumar");
		hobj.put(104, "Kishan");
		hobj.put(104, "Karan");
		System.out.println(hobj);
		
		LinkedHashMap<Integer, String> lobj = new LinkedHashMap<Integer, String>();
		lobj.put(101, "Kiran");
		lobj.put(102, "Priya");
		lobj.put(103, "Preethi");
		lobj.put(105, "Kumar");
		lobj.put(104, "Kishan");
		lobj.put(104, "Karan");
		System.out.println(lobj);
		
		
		TreeMap<Integer, String> hobj1 = new TreeMap<Integer, String>();
		hobj1.put(101, "Kiran");
		hobj1.put(102, "Priya");
		hobj1.put(103, "Preethi");
		hobj1.put(104, "Kumar");
		hobj1.put(105, "Kishan");
		hobj1.put(106, "Karan");
		hobj1.put(107, "Surya");
		System.out.print(hobj1);
		
		for(Map.Entry<Integer, String>m:hobj.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
			
		}
		for(Map.Entry<Integer, String>m:hobj1.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
			
		}
		for(Map.Entry<Integer, String>m:lobj.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
			
		}

	}

}
