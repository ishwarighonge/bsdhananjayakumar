package kumar;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Employee1 {
	private int eid;
	private String ename;
	private float esalary;
	
	


/**
	 * @param eid
	 * @param ename
	 * @param esalary
	 */
	public Employee1(int eid, String ename, float esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

public Employee1() {
super();
// TODO Auto-generated constructor stub
}

public int getEid() {
return eid;
}

public void setEid(int eid) {
this.eid = eid;
}

public String getEname() {
return ename;
}

public void setEname(String ename) {
this.ename = ename;
}

public float getEsalary() {
return esalary;
}

public void setEsalary(float esalary) {
this.esalary = esalary;
}
@Override
public String toString() {
return "Employee1 [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
}
}

class Employee1SortId implements Comparator<Employee1>{


@Override
public int compare(Employee1 o1, Employee1 o2) {
if(o1.getEid()<o2.getEid())
return -1;
else if(o1.getEid()>o2.getEid())
return 1;
else
return 0;
}

}

public class TreeSetUserDefinedMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1SortId esort = new Employee1SortId();
		TreeSet<Employee1> emp = new TreeSet<Employee1>(esort);
		Employee1 e1 = new Employee1(100, "Surya", 45000);
		Employee1 e2 = new Employee1(101, "Priya", 50000);
		Employee1 e3 = new Employee1(102, "Kishan", 55000);
		Employee1 e4 = new Employee1(103, "Kumar", 60000);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		//System.out.println(temp);
		//use Iterator
		
		Iterator<Employee1> itemp = emp.iterator();
		System.out.println("EID\tEname\tEsalary");
		while(itemp.hasNext()) {
		Employee1 e = itemp.next();
		System.out.println(e.getEid()+"\t"+e.getEname()+"\t"+e.getEsalary());


	}

	}
}
