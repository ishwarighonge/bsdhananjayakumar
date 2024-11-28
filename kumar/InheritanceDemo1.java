package kumar;


import java.util.Scanner;


class Parent{
	private int id;
	public String name;
	protected float salary;
	
	public Parent() {
		System.out.println("Parent class constructor");
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
	
	public child() {
		System.out.println("Child class constructor");
	}
	
	void display() {
		//System.out.println("Id"+id);//private data cannot be inherited
		
		System.out.println("Name " +name);
		System.out.println("Salary " +salary);
		super.display();//calls Parent class method 
	}
	
}
public class InheritanceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child cobj = new Child();
		cobj.inputData();
		cobj.display();
		

	}

}
