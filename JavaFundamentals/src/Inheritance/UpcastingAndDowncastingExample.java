package Inheritance;

class Vehicle{
	
	void drive() {
	
		System.out.println("Driving a Vehicle.. ");
		
	}
}

	class Car extends Vehicle{
		
		void drive() {
			
			System.out.println("Driving a Car..");
		}
		
		void speedUp() {
			System.out.println("Speeding Up a Car..");
			
		}
		
	}


public class UpcastingAndDowncastingExample {
	
	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Car();
		vehicle1.drive();
		
		
		//DownCasting
		Vehicle vehicle = new Car();
		Car car = (Car) vehicle;    //downcastingn
		car.drive();
		car.speedUp();
		
	}
	
	

}
