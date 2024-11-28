package kumar;


import java.util.Scanner;


class Parent{
	private int id;//private belongs same class,
	public String name;
	protected float salary;
	
	public Parent(int id,String name, float salary) {
		System.out.println("Parent class constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
		id = sc.nextInt();
		System.out.println("Enter name");
		name = sc.next(); 
		System.out.println("Enter Salary");
		salary = sc.nextFloat();
	}

//Run time polymorphism
//Function overriding

void display() {
	System.out.println("Id "+id);
	
	System.out.println("Name "+name);
	System.out.println("Salary"+salary);
}
}


class Child extends Parent {//is-A relation
	//final int k=9;
	
	public Child(int id, String name, float salary) {
		super(id, name, salary);
	 	System.out.println("Child class constructor");
	}
	
	void display() {
		//System.out.println("Id"+id);//private data cannot be inherited
		//k=k+1;
		System.out.println("Name " +name);
		System.out.println("Salary " +salary);
		super.display();//calls Parent class method 
	}
	
}
public class InheritanceDemo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Child cobj = new Child(87,"Dhananjay",45000);
		//cobj.inputData();
		cobj.display();
		

	}

}
