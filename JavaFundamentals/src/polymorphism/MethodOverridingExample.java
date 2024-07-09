package polymorphism;

class Person{
	
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	
	}
	public void print() {
		
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age );
	}
}
	
class Employee extends Person{
	
	String designation;
	float salary;
	public Employee(String name, int age, String designation, float salary) {
		super(name,age);
		this.designation=designation;
		this.salary=salary;
	}
		public void print() {
			super.print();
			System.out.println("Designation: "+this.designation);
			System.out.println("Salary:"+this.salary);
			
		}
		
	}


public class MethodOverridingExample {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("Karthik",23,"Manager",50000);
		employee.print();
		
	}

}
