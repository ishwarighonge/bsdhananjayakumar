package kumar;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


class Employee11 {
	private int eid;
	private String ename;
	private float esalary;	

public Employee11(int eid, String ename, float esalary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esalary = esalary;
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
	return "Employee11 [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
}
}

class EmployeeSortBySalary implements Comparator<Employee11> {

	@Override
public int compare(Employee11 o1, Employee11 o2) {
	// TODO Auto-generated method stub
		return Float.compare(o1.getEsalary(), o2.getEsalary());
}
}

public class TreeSetUserDefinedMain1 {

	public static void main(String[] args, EmployeeSortBySalary EmployeeSortBySalary) {
		// TODO Auto-generated method stub
		Employee11SortId idComparator = new Employee11SortId();
		Employee11SortSalary salaryComparator = new Employee11SortSalary();
		
		TreeSet<Employee11>empSetById = new TreeSet<>(idComparator);
		TreeSet<Employee11>empSetBySalary = new TreeSet<>(salaryComparator);
		Employee11 e1 = new Employee11(10, "Surya", 40000);
		Employee11 e2 = new Employee11(20, "Priya", 50000);
		Employee11 e3 = new Employee11(30, "Harish", 60000);
		Employee11 e4 = new Employee11(40, "Santhosh", 70000);
		Employee11 e5 = new Employee11(50, "Kumar", 80000);
		
		temployee.add(e1);
		temployee.add(e2);
		temployee.add(e3);
		temployee.add(e4);
		temployee.add(e5);
		
		empSetBySalary.addAll(empSetById);		
		System.out.println(temployee);
		
		//using Iterator
		
		System.out.println("Employee Data sorted based on the salary");
		Iterator<Employee11> it = temployee.iterator();
		
		System.out.println("EID\tENAME\tESALARY");
		System.out.println("**************************");
		
		while(it.hasNext()) {
			Employee11 e = it.next();
			//System.out.println(e);
			
			System.out.println(e.getEid()+"\t"+e.getEname()+"\t"+e.getEsalary());
		}
	}
}	