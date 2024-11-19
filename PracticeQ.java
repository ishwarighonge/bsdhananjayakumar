package kumar;

abstract class Vehicle {
	abstract public void move();
	
}
class Car extends Vehicle {
	@Override
	public void move() {
		System.out.println("Car is moving");
		}
}
class Bike extends Vehicle {
	@Override
	public void move() {
		System.out.println("Bike is moving");
	}
	
}
public class PracticeQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle Objcar = new Car();
		Vehicle Objbike = new Bike();
		
		Objcar.move(); 
		Objbike.move();

	}

}
