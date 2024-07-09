package constructors;

class Person{
	
	String name;
   public Person() {
	   
	   System.out.println("Person Class Constructor Invoked.");
		name= "Ishwor Reule";	
		
	}	
   
   		public Person(String name) {
   			System.out.println("Person Class Parameterizd Constructor Invoked.");
   			this.name = name;
   			
   		}
}

class Employee extends Person{
	
	String designation;
	public Employee() {
		System.out.println("Employee Class Constructor Invoked.");
		designation = "Manager";
	}
	
	public Employee(String designation) {
		System.out.println("Employee class parameterized constructor invoked.");
		this.designation = designation;
	}
}

public class ConstructorChainingWithInheritance {
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		Employee employee1 = new Employee("Senior Manager");
		
		
		
	}

}
